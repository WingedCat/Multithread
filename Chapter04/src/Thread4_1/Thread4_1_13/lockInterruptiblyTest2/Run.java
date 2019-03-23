package Thread4_1.Thread4_1_13.lockInterruptiblyTest2;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyService service = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();
        System.out.println("main end");

        /**
         * lock begin A
         * main end
         * B 被中断了
         * java.lang.InterruptedException
         * 	at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireInterruptibly(AbstractQueuedSynchronizer.java:1220)
         * 	at java.util.concurrent.locks.ReentrantLock.lockInterruptibly(ReentrantLock.java:335)
         * 	at Thread4_1.Thread4_1_13.lockInterruptiblyTest2.MyService.waitMethod(MyService.java:12)
         * 	at Thread4_1.Thread4_1_13.lockInterruptiblyTest2.Run$1.run(Run.java:9)
         * 	at java.lang.Thread.run(Thread.java:748)
         * lock end A
         * A 释放锁
         */
    }
}
