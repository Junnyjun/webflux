package git.io.netty.handler

import io.netty.bootstrap.Bootstrap
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInitializer
import io.netty.channel.SimpleChannelInboundHandler
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel
import io.netty.channel.socket.nio.NioSocketChannel
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory.getILoggerFactory

class EchoServerTest {

    @Test
    fun echoPingTest() {
        val echoClientHandler = EchoClientHandler()
        val group = NioEventLoopGroup()
        val serverBootstrap = Bootstrap()
            .group(group)
            .channel(NioSocketChannel::class.java)
            .remoteAddress("localhost", 8080)
            .handler(object : ChannelInitializer<SocketChannel>() {
                override fun initChannel(ch: SocketChannel) {
                    ch.pipeline().addLast(echoClientHandler)
                }
            })
        val channelFuture = serverBootstrap.connect().sync()
        channelFuture.channel().closeFuture().sync()
    }

    class EchoClientHandler : SimpleChannelInboundHandler<ByteBuf>() {
        private val logger = getILoggerFactory().getLogger(EchoClientHandler::class.java.name)

        override fun channelRead0(p0: ChannelHandlerContext?, p1: ByteBuf?) {
            logger.info("[Echo] Received: $p1")
        }

        override fun channelActive(ctx: ChannelHandlerContext) {
            logger.info("[Echo] Connected to server")
            ctx.writeAndFlush(Unpooled.copiedBuffer("Hello, World!".toByteArray()))
        }
    }
}