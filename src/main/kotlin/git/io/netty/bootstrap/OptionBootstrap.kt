package git.io.netty.bootstrap

import io.netty.bootstrap.Bootstrap
import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelFuture
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelOption
import io.netty.channel.SimpleChannelInboundHandler
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.nio.NioSocketChannel
import io.netty.util.AttributeKey
import java.net.InetSocketAddress

fun main() {
    val id: AttributeKey<Int> = AttributeKey.valueOf("ID")
    val group = NioEventLoopGroup()

    try {
        val bootstrap = Bootstrap()
        bootstrap.group(group)
            .channel(NioSocketChannel::class.java)
            .handler(object : SimpleChannelInboundHandler<ByteBuf>() {
                override fun channelRegistered(ctx: ChannelHandlerContext) {
                    val idValue = ctx.channel().attr(id).get()
                    // ID 값으로 작업 수행
                }

                override fun channelRead0(ctx: ChannelHandlerContext, byteBuf: ByteBuf) {
                    println("Received data")
                }
            })

        bootstrap.option(ChannelOption.SO_KEEPALIVE, true)
            .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000)
        bootstrap.attr(id, 123456)

        val future: ChannelFuture = bootstrap.connect(InetSocketAddress("www.manning.com", 80))
        future.syncUninterruptibly()
    } finally {
        group.shutdownGracefully()
    }
}