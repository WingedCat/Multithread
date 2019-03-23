package Thread4_1.Thread4_1_10.lockMethodTest1.test2;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod1();
            }
        };
        Thread[] threadArray = new Thread[10];
        for(int i=0;i<10;i++)
            threadArray[i] = new Thread(runnable);
        for(int i=0;i<10;i++){
            threadArray[i].start();
        }
        Thread.sleep(2000);
        System.out.println("有线程数："+service.lock.getQueueLength()+"在等待获取锁");
        /**
         * ThreadName = Thread-0  进入方法
         * 有线程数：9在等待获取锁
         */
    }
}
