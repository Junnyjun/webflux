package git.io.netty.executors

import java.util.concurrent.Executors
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.TimeUnit


fun main(args: Array<String>) {
    val executor = Executors.newScheduledThreadPool(10)


    // 60초 후에 실행될 작업 예약
    val future: ScheduledFuture<*> = executor.schedule(
        { println("60 seconds later") },
        60, TimeUnit.SECONDS
    )


    // 작업 완료 후 리소스를 해제하기 위해 ScheduledExecutorService 종료
    executor.shutdown()
}

class ThreadScheduler {
}