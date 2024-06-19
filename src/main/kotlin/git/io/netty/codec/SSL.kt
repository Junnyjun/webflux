package git.io.netty.codec

import io.netty.channel.Channel
import io.netty.channel.ChannelInitializer
import io.netty.handler.ssl.SslContext
import io.netty.handler.ssl.SslHandler

class SslChannelInitializer(
    private val context: SslContext,
    private val startTls: Boolean
) : ChannelInitializer<Channel>() {
    override fun initChannel(ch: Channel) {
        val engine = context.newEngine(ch.alloc())
        ch.pipeline().addFirst("ssl", SslHandler(engine, startTls))
    }
}