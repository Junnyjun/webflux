package git.io.netty.handler

import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.nio.NioServerSocketChannel
import jakarta.annotation.PostConstruct
import jakarta.annotation.PreDestroy
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
    private val childHandler = serverBootstrap.group(group)
        .channel(NioServerSocketChannel::class.java)
        .localAddress(port)
        .childHandler(echoServerHandler)


    @PreDestroy
    fun stop() {
        val bind = childHandler.bind().sync()
        val sync = bind.channel().closeFuture().sync()
        group.shutdownGracefully().sync()
    }
}