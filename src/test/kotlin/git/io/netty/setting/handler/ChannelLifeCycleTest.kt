package git.io.netty.setting.handler

import io.netty.channel.ChannelInitializer
import io.netty.channel.socket.SocketChannel
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ChannelLifeCycleTest{

        @Test
        fun testChannelLifeCycle(){
            val channelLifeCycle = ChannelLifeCycle()


            val channelInitializer = object : ChannelInitializer<SocketChannel>() {
                override fun initChannel(ch: SocketChannel) {
                    ch.pipeline().addLast(channelLifeCycle)
                }
            }


            assertNotNull(channelLifeCycle)
        }

}