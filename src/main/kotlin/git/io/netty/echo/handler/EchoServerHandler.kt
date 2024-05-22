package git.io.netty.echo.handler

import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import io.netty.channel.ChannelFutureListener.CLOSE
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInboundHandlerAdapter
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.nio.charset.Charset

@Component
class EchoServerHandler : ChannelInboundHandlerAdapter() {
    private val logger =  LoggerFactory.getILoggerFactory().getLogger(EchoServerHandler::class.java.name)

    override fun channelRead(ctx: ChannelHandlerContext, msg: Any) {
        logger.info("[Echo] Received: ${(msg as ByteBuf).toString(Charset.defaultCharset())}")
        ctx.write(msg)
    }

    override fun channelReadComplete(ctx: ChannelHandlerContext) {
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER)
            .addListener(CLOSE)
    }

    override fun channelActive(ctx: ChannelHandlerContext) {
        logger.info("[Echo] Connected to client")
    }
}