package git.io.netty.executors

import io.netty.channel.Channel
import io.netty.channel.ChannelFuture
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.nio.NioSocketChannel
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.TimeUnit


//fun main(args: Array<String>) {
//    val executor = Executors.newScheduledThreadPool(10)
//    val future: ScheduledFuture<*> = executor.schedule(fun() = println("60 seconds later"), 60, TimeUnit.SECONDS)
//    executor.shutdown()
//}

fun main(args: Array<String>) {
    val group = NioEventLoopGroup()
    val channel: Channel = NioSocketChannel()

    with(channel) {
        group.register(this)

        eventLoop().scheduleAtFixedRate(fun() = println("Run every 3 seconds"), 3, 3, TimeUnit.SECONDS)
        eventLoop().schedule(fun(): ChannelFuture? = channel.closeFuture().sync(), 5, TimeUnit.SECONDS)


    }
}
