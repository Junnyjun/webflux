package git.io.netty.transport

import java.io.IOException
import java.net.ServerSocket
import java.net.Socket
import java.nio.charset.Charset

class PlainOioServer {
    fun serve(port: Int) {
        val socket = ServerSocket(port)
        try {
            while (true) {
                val clientSocket: Socket = socket.accept()
                Thread {
                        clientSocket.use { socket ->
                            socket.getOutputStream().use { out ->
                                out.write("Hi!\r\n".toByteArray(Charset.forName("UTF-8")))
                                out.flush()
                            }
                    }
                }.start()
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}