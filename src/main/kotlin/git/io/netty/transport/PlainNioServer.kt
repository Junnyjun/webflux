package git.io.netty.transport

import java.io.IOException
import java.net.InetSocketAddress
import java.nio.ByteBuffer
import java.nio.channels.SelectionKey
import java.nio.channels.Selector
import java.nio.channels.ServerSocketChannel
import java.nio.channels.SocketChannel

class PlainNioServer {

    fun serve(port: Int) {
        ServerSocketChannel.open().use { serverChannel ->
            serverChannel.configureBlocking(false)
            serverChannel.socket().bind(InetSocketAddress(port))
            Selector.open().use { selector ->
                serverChannel.register(selector, SelectionKey.OP_ACCEPT)
                val msg = ByteBuffer.wrap("Hi!\r\n".toByteArray())

                while (true) {
                    selector.select()
                    val readyKeys = selector.selectedKeys()
                    val iterator = readyKeys.iterator()

                    while (iterator.hasNext()) {
                        val key = iterator.next()
                        iterator.remove()
                        handleKey(key, selector, msg)
                    }
                }
            }
        }
    }

    private fun handleKey(key: SelectionKey, selector: Selector, msg: ByteBuffer) {
        try {
            when {
                key.isAcceptable -> handleAccept(key, selector, msg)
                key.isWritable -> handleWrite(key)
            }
        } catch (ex: IOException) {
            key.cancel()
            try {
                key.channel().close()
            } catch (cex: IOException) {
                // ignore on close
            }
        }
    }

    private fun handleAccept(key: SelectionKey, selector: Selector, msg: ByteBuffer) {
        val serverChannel = key.channel() as ServerSocketChannel
        val clientChannel = serverChannel.accept()
        clientChannel.configureBlocking(false)
        clientChannel.register(selector, SelectionKey.OP_WRITE or SelectionKey.OP_READ, msg.duplicate())
        println("Accepted connection from $clientChannel")
    }

    private fun handleWrite(key: SelectionKey) {
        val clientChannel = key.channel() as SocketChannel
        val buffer = key.attachment() as ByteBuffer

        while (buffer.hasRemaining()) {
            if (clientChannel.write(buffer) == 0) {
                break
            }
        }
        clientChannel.close()
    }
}