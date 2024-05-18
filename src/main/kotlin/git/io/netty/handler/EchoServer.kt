package git.io.netty.handler

import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.EventLoopGroup
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.nio.NioServerSocketChannel
import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class EchoServer (
    @Value("\${netty.port:8080}")
    private val port: Int,
    private val echoServerHandler: EchoServerHandler,
) {
    private val group: NioEventLoopGroup = NioEventLoopGroup()
    private val serverBootstrap: ServerBootstrap = ServerBootstrap()

    @PostConstruct
    fun start() {
        val childHandler = serverBootstrap.group(group)
            .channel(NioServerSocketChannel::class.java)
            .localAddress(port)
            .childHandler(echoServerHandler)

        val bind = childHandler.bind().sync()
        val sync = bind.channel().closeFuture().sync()

    }

}