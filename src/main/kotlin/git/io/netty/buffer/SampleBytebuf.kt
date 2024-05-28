package git.io.netty.buffer

import io.netty.buffer.ByteBuf
import io.netty.buffer.ByteBufAllocator
import io.netty.util.ByteProcessor
import java.io.InputStream
import java.io.OutputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.channels.FileChannel
import java.nio.channels.GatheringByteChannel
import java.nio.channels.ScatteringByteChannel
import java.nio.charset.Charset

class SampleBytebuf : ByteBuf() {
    override fun equals(other: Any?): Boolean {
        TODO("Not yet implemented")
    }

    override fun hashCode(): Int {
        TODO("Not yet implemented")
    }

    override fun toString(p0: Charset?): String {
        TODO("Not yet implemented")
    }

    override fun toString(p0: Int, p1: Int, p2: Charset?): String {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        TODO("Not yet implemented")
    }

    override fun refCnt(): Int {
        TODO("Not yet implemented")
    }

    override fun retain(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun retain(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun touch(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun touch(p0: Any?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun release(): Boolean {
        TODO("Not yet implemented")
    }

    override fun release(p0: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun compareTo(other: ByteBuf?): Int {
        TODO("Not yet implemented")
    }

    override fun capacity(): Int {
        TODO("Not yet implemented")
    }

    override fun capacity(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun maxCapacity(): Int {
        TODO("Not yet implemented")
    }

    override fun alloc(): ByteBufAllocator {
        TODO("Not yet implemented")
    }

    override fun order(): ByteOrder {
        TODO("Not yet implemented")
    }

    override fun order(p0: ByteOrder?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun unwrap(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun isDirect(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isReadOnly(): Boolean {
        TODO("Not yet implemented")
    }

    override fun asReadOnly(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun readerIndex(): Int {
        TODO("Not yet implemented")
    }

    override fun readerIndex(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writerIndex(): Int {
        TODO("Not yet implemented")
    }

    override fun writerIndex(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setIndex(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun readableBytes(): Int {
        TODO("Not yet implemented")
    }

    override fun writableBytes(): Int {
        TODO("Not yet implemented")
    }

    override fun maxWritableBytes(): Int {
        TODO("Not yet implemented")
    }

    override fun isReadable(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isReadable(p0: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun isWritable(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isWritable(p0: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun clear(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun markReaderIndex(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun resetReaderIndex(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun markWriterIndex(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun resetWriterIndex(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun discardReadBytes(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun discardSomeReadBytes(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun ensureWritable(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun ensureWritable(p0: Int, p1: Boolean): Int {
        TODO("Not yet implemented")
    }

    override fun getBoolean(p0: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun getByte(p0: Int): Byte {
        TODO("Not yet implemented")
    }

    override fun getUnsignedByte(p0: Int): Short {
        TODO("Not yet implemented")
    }

    override fun getShort(p0: Int): Short {
        TODO("Not yet implemented")
    }

    override fun getShortLE(p0: Int): Short {
        TODO("Not yet implemented")
    }

    override fun getUnsignedShort(p0: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getUnsignedShortLE(p0: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getMedium(p0: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getMediumLE(p0: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getUnsignedMedium(p0: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getUnsignedMediumLE(p0: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getInt(p0: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getIntLE(p0: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getUnsignedInt(p0: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getUnsignedIntLE(p0: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getLong(p0: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getLongLE(p0: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getChar(p0: Int): Char {
        TODO("Not yet implemented")
    }

    override fun getFloat(p0: Int): Float {
        TODO("Not yet implemented")
    }

    override fun getDouble(p0: Int): Double {
        TODO("Not yet implemented")
    }

    override fun getBytes(p0: Int, p1: ByteBuf?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun getBytes(p0: Int, p1: ByteBuf?, p2: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun getBytes(p0: Int, p1: ByteBuf?, p2: Int, p3: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun getBytes(p0: Int, p1: ByteArray?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun getBytes(p0: Int, p1: ByteArray?, p2: Int, p3: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun getBytes(p0: Int, p1: ByteBuffer?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun getBytes(p0: Int, p1: OutputStream?, p2: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun getBytes(p0: Int, p1: GatheringByteChannel?, p2: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getBytes(p0: Int, p1: FileChannel?, p2: Long, p3: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getCharSequence(p0: Int, p1: Int, p2: Charset?): CharSequence {
        TODO("Not yet implemented")
    }

    override fun setBoolean(p0: Int, p1: Boolean): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setByte(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setShort(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setShortLE(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setMedium(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setMediumLE(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setInt(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setIntLE(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setLong(p0: Int, p1: Long): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setLongLE(p0: Int, p1: Long): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setChar(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setFloat(p0: Int, p1: Float): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setDouble(p0: Int, p1: Double): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setBytes(p0: Int, p1: ByteBuf?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setBytes(p0: Int, p1: ByteBuf?, p2: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setBytes(p0: Int, p1: ByteBuf?, p2: Int, p3: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setBytes(p0: Int, p1: ByteArray?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setBytes(p0: Int, p1: ByteArray?, p2: Int, p3: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setBytes(p0: Int, p1: ByteBuffer?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setBytes(p0: Int, p1: InputStream?, p2: Int): Int {
        TODO("Not yet implemented")
    }

    override fun setBytes(p0: Int, p1: ScatteringByteChannel?, p2: Int): Int {
        TODO("Not yet implemented")
    }

    override fun setBytes(p0: Int, p1: FileChannel?, p2: Long, p3: Int): Int {
        TODO("Not yet implemented")
    }

    override fun setZero(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun setCharSequence(p0: Int, p1: CharSequence?, p2: Charset?): Int {
        TODO("Not yet implemented")
    }

    override fun readBoolean(): Boolean {
        TODO("Not yet implemented")
    }

    override fun readByte(): Byte {
        TODO("Not yet implemented")
    }

    override fun readUnsignedByte(): Short {
        TODO("Not yet implemented")
    }

    override fun readShort(): Short {
        TODO("Not yet implemented")
    }

    override fun readShortLE(): Short {
        TODO("Not yet implemented")
    }

    override fun readUnsignedShort(): Int {
        TODO("Not yet implemented")
    }

    override fun readUnsignedShortLE(): Int {
        TODO("Not yet implemented")
    }

    override fun readMedium(): Int {
        TODO("Not yet implemented")
    }

    override fun readMediumLE(): Int {
        TODO("Not yet implemented")
    }

    override fun readUnsignedMedium(): Int {
        TODO("Not yet implemented")
    }

    override fun readUnsignedMediumLE(): Int {
        TODO("Not yet implemented")
    }

    override fun readInt(): Int {
        TODO("Not yet implemented")
    }

    override fun readIntLE(): Int {
        TODO("Not yet implemented")
    }

    override fun readUnsignedInt(): Long {
        TODO("Not yet implemented")
    }

    override fun readUnsignedIntLE(): Long {
        TODO("Not yet implemented")
    }

    override fun readLong(): Long {
        TODO("Not yet implemented")
    }

    override fun readLongLE(): Long {
        TODO("Not yet implemented")
    }

    override fun readChar(): Char {
        TODO("Not yet implemented")
    }

    override fun readFloat(): Float {
        TODO("Not yet implemented")
    }

    override fun readDouble(): Double {
        TODO("Not yet implemented")
    }

    override fun readBytes(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun readBytes(p0: ByteBuf?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun readBytes(p0: ByteBuf?, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun readBytes(p0: ByteBuf?, p1: Int, p2: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun readBytes(p0: ByteArray?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun readBytes(p0: ByteArray?, p1: Int, p2: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun readBytes(p0: ByteBuffer?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun readBytes(p0: OutputStream?, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun readBytes(p0: GatheringByteChannel?, p1: Int): Int {
        TODO("Not yet implemented")
    }

    override fun readBytes(p0: FileChannel?, p1: Long, p2: Int): Int {
        TODO("Not yet implemented")
    }

    override fun readSlice(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun readRetainedSlice(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun readCharSequence(p0: Int, p1: Charset?): CharSequence {
        TODO("Not yet implemented")
    }

    override fun skipBytes(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeBoolean(p0: Boolean): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeByte(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeShort(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeShortLE(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeMedium(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeMediumLE(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeInt(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeIntLE(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeLong(p0: Long): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeLongLE(p0: Long): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeChar(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeFloat(p0: Float): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeDouble(p0: Double): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeBytes(p0: ByteBuf?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeBytes(p0: ByteBuf?, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeBytes(p0: ByteBuf?, p1: Int, p2: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeBytes(p0: ByteArray?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeBytes(p0: ByteArray?, p1: Int, p2: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeBytes(p0: ByteBuffer?): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeBytes(p0: InputStream?, p1: Int): Int {
        TODO("Not yet implemented")
    }

    override fun writeBytes(p0: ScatteringByteChannel?, p1: Int): Int {
        TODO("Not yet implemented")
    }

    override fun writeBytes(p0: FileChannel?, p1: Long, p2: Int): Int {
        TODO("Not yet implemented")
    }

    override fun writeZero(p0: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun writeCharSequence(p0: CharSequence?, p1: Charset?): Int {
        TODO("Not yet implemented")
    }

    override fun indexOf(p0: Int, p1: Int, p2: Byte): Int {
        TODO("Not yet implemented")
    }

    override fun bytesBefore(p0: Byte): Int {
        TODO("Not yet implemented")
    }

    override fun bytesBefore(p0: Int, p1: Byte): Int {
        TODO("Not yet implemented")
    }

    override fun bytesBefore(p0: Int, p1: Int, p2: Byte): Int {
        TODO("Not yet implemented")
    }

    override fun forEachByte(p0: ByteProcessor?): Int {
        TODO("Not yet implemented")
    }

    override fun forEachByte(p0: Int, p1: Int, p2: ByteProcessor?): Int {
        TODO("Not yet implemented")
    }

    override fun forEachByteDesc(p0: ByteProcessor?): Int {
        TODO("Not yet implemented")
    }

    override fun forEachByteDesc(p0: Int, p1: Int, p2: ByteProcessor?): Int {
        TODO("Not yet implemented")
    }

    override fun copy(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun copy(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun slice(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun slice(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun retainedSlice(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun retainedSlice(p0: Int, p1: Int): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun duplicate(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun retainedDuplicate(): ByteBuf {
        TODO("Not yet implemented")
    }

    override fun nioBufferCount(): Int {
        TODO("Not yet implemented")
    }

    override fun nioBuffer(): ByteBuffer {
        TODO("Not yet implemented")
    }

    override fun nioBuffer(p0: Int, p1: Int): ByteBuffer {
        TODO("Not yet implemented")
    }

    override fun internalNioBuffer(p0: Int, p1: Int): ByteBuffer {
        TODO("Not yet implemented")
    }

    override fun nioBuffers(): Array<ByteBuffer> {
        TODO("Not yet implemented")
    }

    override fun nioBuffers(p0: Int, p1: Int): Array<ByteBuffer> {
        TODO("Not yet implemented")
    }

    override fun hasArray(): Boolean {
        TODO("Not yet implemented")
    }

    override fun array(): ByteArray {
        TODO("Not yet implemented")
    }

    override fun arrayOffset(): Int {
        TODO("Not yet implemented")
    }

    override fun hasMemoryAddress(): Boolean {
        TODO("Not yet implemented")
    }

    override fun memoryAddress(): Long {
        TODO("Not yet implemented")
    }

}