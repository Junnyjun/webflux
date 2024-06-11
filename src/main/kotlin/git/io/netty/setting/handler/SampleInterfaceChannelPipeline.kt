package git.io.netty.setting.handler

import io.netty.channel.ChannelFuture
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInboundHandlerAdapter

class SampleInterfaceChannelPipeline : ChannelInboundHandlerAdapter() {
    override fun channelRead(ctx: ChannelHandlerContext, msg: Any) {
        // 이벤트 처리 로직
        System.out.println("Received message: " + msg);
        // 이벤트를 다음 핸들러로 전달
        ctx.fireChannelRead(msg);
        ctx.close()
    }

    override fun exceptionCaught(ctx: ChannelHandlerContext?, cause: Throwable?) {
        super.exceptionCaught(ctx, cause)
    }
}
