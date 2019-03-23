package Thread4_1.Thread4_1_3.UseConditionWaitNotifyError;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        /**
         * condition.await()方法的调用也必须在获取锁后
         * 	Exception in thread "Thread-0" java.lang.IllegalMonitorStateException
         * 	at java.util.concurrent.locks.ReentrantLock$Sync.tryRelease(ReentrantLock.java:151)
         * 	at java.util.concurrent.locks.AbstractQueuedSynchronizer.release(AbstractQueuedSynchronizer.java:1261)
         * 	at java.util.concurrent.locks.AbstractQueuedSynchronizer.fullyRelease(AbstractQueuedSynchronizer.java:1723)
         * 	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2036)
         * 	at Thread4_1.Thread4_1_3.UseConditionWaitNotifyError.MyService.await(MyService.java:14)
         * 	at Thread4_1.Thread4_1_3.UseConditionWaitNotifyError.ThreadA.run(ThreadA.java:12)
         */
    }
}
