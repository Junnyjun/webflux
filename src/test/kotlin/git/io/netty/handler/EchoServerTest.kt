package git.io.netty.handler

import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInitializer
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EchoServerTest{

    @Test
    fun echoServerTest(){
        EchoServerSample(8080).start()

    }

    class EchoServerSample(
        private val port: Int,
    ){
        fun start(){
            val serverHandler = EchoServerHandler()
            val echoClient = EchoClientHandler()

            val echoServerHandler = object : ChannelInitializer<SocketChannel>(){
                override fun initChannel(p0: SocketChannel) {
                    p0.pipeline().addLast(echoClient)
                }
            }
            val group = NioEventLoopGroup()

            val serverBootstrap = ServerBootstrap()
            serverBootstrap.group(group)
                .channel(NioServerSocketChannel::class.java)
                .localAddress(port)
                .childHandler(echoServerHandler)

            val bind = serverBootstrap.bind().sync()
            bind.channel().closeFuture().sync()
        }
    }
}