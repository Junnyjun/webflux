package git.io.netty.setting.handler

import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInboundHandlerAdapter
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

@Configuration
class SampleChannelInboundHandler : ChannelInboundHandlerAdapter() {
    override fun channelRead(ctx: ChannelHandlerContext, msg: Any) {
        println("Received: $msg")
        ctx.write(msg)
    }
}