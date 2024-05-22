package git.io.netty.echo.server

import git.io.netty.echo.handler.EchoServerHandler
import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.nio.NioServerSocketChannel
import jakarta.annotation.PreDestroy
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class EchoServer (
    @Value("\${netty.port:28080}")
    private val port: Int,
    private val echoServerHandler: EchoServerHandler,
) {
    private val logger: Logger = LoggerFactory.getLogger(EchoServer::class.java)
    private val group: NioEventLoopGroup = NioEventLoopGroup()
    private val serverBootstrap: ServerBootstrap = ServerBootstrap()

    @Bean
    fun start(): ServerBootstrap {
        logger.info("[Echo] Starting server on port $port")
        return serverBootstrap.group(group)
            .channel(NioServerSocketChannel::class.java)
            .localAddress(port)
            .childHandler(echoServerHandler)
            .also { it.bind().sync() }
    }

    @PreDestroy
    fun stop() {
        logger.info("[Echo] Stopping server")
        group.shutdownGracefully().sync()
    }
}