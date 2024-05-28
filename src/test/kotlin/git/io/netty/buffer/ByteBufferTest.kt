package git.io.netty.buffer

import io.netty.buffer.ByteBuf
import org.junit.jupiter.api.Test


class ByteBufferTest {

    @Test
    fun test() {
        val heapBuffer = io.netty.buffer.ByteBufAllocator.DEFAULT.heapBuffer(10)
        heapBuffer.writeBytes("Hello".toByteArray())
        println(heapBuffer.toString(io.netty.util.CharsetUtil.UTF_8))
        heapBuffer.release()
    }

    @Test
    fun testDirect() {
        val directBuffer = io.netty.buffer.ByteBufAllocator.DEFAULT.directBuffer(10)
        directBuffer.writeBytes("World".toByteArray())
        println(directBuffer.readInt())
        println(directBuffer.toString(io.netty.util.CharsetUtil.UTF_8))
        directBuffer.release()
    }

    @Test
    fun testComposite() {
        val compositeBuffer = io.netty.buffer.ByteBufAllocator.DEFAULT.compositeBuffer()
        val heapBuffer = io.netty.buffer.ByteBufAllocator.DEFAULT.heapBuffer(10)
        val directBuffer = io.netty.buffer.ByteBufAllocator.DEFAULT.directBuffer(10)
        heapBuffer.writeBytes("Hello".toByteArray())
        directBuffer.writeBytes("World".toByteArray())
        compositeBuffer.addComponents(heapBuffer, directBuffer)

        val slice = compositeBuffer.slice(0, heapBuffer.readableBytes())
        println(slice.toString(io.netty.util.CharsetUtil.UTF_8))
        println(compositeBuffer.toString(io.netty.util.CharsetUtil.UTF_8))
        compositeBuffer.release()
    }

    @Test
    fun testPooled() {
        val pooledBuffer = io.netty.buffer.ByteBufAllocator.DEFAULT.buffer(10)
        pooledBuffer.writeBytes("Hello".toByteArray())

        println("Read Index: ${pooledBuffer.readerIndex()}")
        val readBytes: ByteBuf = pooledBuffer.readBytes(2)
        println("Read Index: ${pooledBuffer.readerIndex()}")
        println(readBytes.toString(io.netty.util.CharsetUtil.UTF_8))

        println("Discard Before writableBytes: ${pooledBuffer.writableBytes()}")
        println("Discard Before readableBytes: ${pooledBuffer.readableBytes()}")

        pooledBuffer.discardReadBytes();
        println("Discard After writableBytes: ${pooledBuffer.writableBytes()}")
        println("Discard After readableBytes: ${pooledBuffer.readableBytes()}")

        println(pooledBuffer.toString(io.netty.util.CharsetUtil.UTF_8))
        pooledBuffer.release()
    }

}