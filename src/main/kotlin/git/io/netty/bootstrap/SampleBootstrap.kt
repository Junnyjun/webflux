package git.io.netty.bootstrap

import io.netty.bootstrap.Bootstrap
import io.netty.bootstrap.ServerBootstrap
import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelFuture
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInitializer
import io.netty.channel.SimpleChannelInboundHandler
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel
import io.netty.channel.socket.nio.NioSocketChannel
import java.net.InetSocketAddress

fun main2() {
    val group = NioEventLoopGroup()
        val bootstrap = Bootstrap()
        bootstrap.group(group)
            .channel(NioSocketChannel::class.java)
            .handler(object : ChannelInitializer<NioSocketChannel>() {
                override fun initChannel(ch: NioSocketChannel) {
                    ch.pipeline().addLast(object : SimpleChannelInboundHandler<ByteBuf>() {
                        override fun channelRead0(ctx: ChannelHandlerContext, msg: ByteBuf) {
                            println("Received data")
                        }
                    })
                }
            })

        val future = bootstrap.connect(InetSocketAddress("www.example.com", 80))
        future.addListener { f ->

                println("Connection established")
        }
        future.sync()
        group.shutdownGracefully()
}

fun main() {
    val group = NioEventLoopGroup()
    try {
        val bootstrap = ServerBootstrap()
        bootstrap.group(group)
            .channel(NioServerSocketChannel::class.java)
            .childHandler(object : ChannelInitializer<SocketChannel>() {
                override fun initChannel(ch: SocketChannel) {
                    ch.pipeline().addLast(object : SimpleChannelInboundHandler<ByteBuf>() {
                        override fun channelRead0(ctx: ChannelHandlerContext, msg: ByteBuf) {
                            println("Received data")
                        }
                    })
                }
            })

        val future: ChannelFuture = bootstrap.bind(InetSocketAddress(8080))
        future.addListener { f ->
            if (f.isSuccess) {
                println("Server bound")
            } else {
                println("Bind attempt failed")
                f.cause().printStackTrace()
            }
        }
//        future.sync()
    } finally {
        group.shutdownGracefully()
    }
}