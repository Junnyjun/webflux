package git.io.netty.setting.handler

import io.netty.channel.ChannelInitializer
import io.netty.channel.socket.SocketChannel
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

@Configuration
class SampleChannelInitializer(
    private val sampleChannelInboundHandler: SampleChannelInboundHandler
): ChannelInitializer<SocketChannel>() {
    override fun initChannel(ch: SocketChannel) {
        ch.pipeline().addLast(sampleChannelInboundHandler)
    }
}