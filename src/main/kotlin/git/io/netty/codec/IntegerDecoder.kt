package git.io.netty.codec

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder
import io.netty.handler.codec.MessageToByteEncoder

class ToIntegerDecoder : ByteToMessageDecoder() {
    override fun decode(ctx: ChannelHandlerContext, `in`: ByteBuf, out: List<Any>) {
        if (`in`.readableBytes() >= 4) {
            out + `in`.readInt()
        }
    }
}
class ShortToByteEncoder : MessageToByteEncoder<Short>() {
    override fun encode(ctx: ChannelHandlerContext, msg: Short, out: ByteBuf) {
        out.writeShort(msg.toInt())
    }
}