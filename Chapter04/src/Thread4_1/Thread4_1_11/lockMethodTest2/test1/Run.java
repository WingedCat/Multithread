package Thread4_1.Thread4_1_11.lockMethodTest2.test1;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(threadA));//hasQueuedThread()方法查询指定的线程是否正在等待获取此锁的锁定
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());//hasQueuedThreads()查询是否有线程正在等待获取此锁
    }
    /**
     * false
     * true
     * true
     */
}
