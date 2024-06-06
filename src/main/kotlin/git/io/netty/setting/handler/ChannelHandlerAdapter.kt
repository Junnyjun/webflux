package git.io.netty.setting.handler

import git.io.netty.echo.handler.EchoServerHandler
import io.netty.channel.ChannelInboundHandlerAdapter
import io.netty.util.ResourceLeakDetector
import org.slf4j.LoggerFactory
import org.slf4j.LoggerFactory.getILoggerFactory

class ChannelHandlerAdapter : ChannelInboundHandlerAdapter() {

}

class Detector : ResourceLeakDetector<ChannelHandlerAdapter>(ChannelHandlerAdapter::class.java, 1) {
    private val logger =  getILoggerFactory().getLogger(Detector::class.java.name)

    public override fun reportTracedLeak(resourceType: String?, records: String?) {
        logger.error("Leak detected: $resourceType\n$records")
        super.reportTracedLeak(resourceType, records)
    }
}

fun setDetector() {
    ResourceLeakDetector.setLevel(ResourceLeakDetector.Level.PARANOID)
    ResourceLeakDetector.addExclusions(ChannelHandlerAdapter::class.java)
    ResourceLeakDetector.addExclusions(EchoServerHandler::class.java)
    ResourceLeakDetector.LeakListener { resourceType, records ->
        Detector().reportTracedLeak(resourceType, records)
    }
}