package git.io.netty.setting.handler

import io.netty.bootstrap.Bootstrap
import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.ChannelInitializer
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel
import io.netty.channel.socket.nio.NioSocketChannel
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ChannelLifeCycleTest{

        @Test
        fun testChannelLifeCycle(){
            val channelLifeCycle = ChannelLifeCycle()

            val serverBootstrap = ServerBootstrap()
                .group(NioEventLoopGroup())
                .channel(NioServerSocketChannel::class.java)
                .localAddress("localhost", 28080)
                .childHandler(channelLifeCycle)
                .also { it.bind().sync() }

            assertNotNull(channelLifeCycle)
        }

}