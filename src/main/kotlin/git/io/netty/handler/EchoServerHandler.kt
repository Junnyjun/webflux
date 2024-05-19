package git.io.netty.handler

import io.netty.buffer.Unpooled
import io.netty.channel.ChannelFutureListener.CLOSE
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInboundHandlerAdapter
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy

@Configuration(proxyBeanMethods = false)
class EchoServerHandler : ChannelInboundHandlerAdapter() {
    private val logger =  LoggerFactory.getILoggerFactory().getLogger(EchoServerHandler::class.java.name)

    override fun channelRead(ctx: ChannelHandlerContext, msg: Any) {
        logger.info("[Echo] Received: $msg")
        ctx.write(msg)
    }

    override fun channelReadComplete(ctx: ChannelHandlerContext) {
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER)
            .addListener(CLOSE)
    }


}