package git.io.netty

import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication

@SpringBootApplication
class NettyApplication

fun main(args: Array<String>) {
    SpringApplicationBuilder(NettyApplication::class.java)
        .web(WebApplicationType.NONE)
        .run(*args)


}
