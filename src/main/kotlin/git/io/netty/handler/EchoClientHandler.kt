package git.io.netty.handler

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.SimpleChannelInboundHandler
import org.slf4j.LoggerFactory
import org.slf4j.LoggerFactory.getILoggerFactory

class EchoClientHandler: SimpleChannelInboundHandler<ByteBuf>() {
    private val logger = getILoggerFactory().getLogger(EchoClientHandler::class.java.name)
    override fun channelRead0(p0: ChannelHandlerContext?, p1: ByteBuf?) {
        logger.info("[Echo] Received: $p1")
    }

    override fun channelActive(ctx: ChannelHandlerContext) {
        ctx.writeAndFlush("Hello, World!")
    }


}