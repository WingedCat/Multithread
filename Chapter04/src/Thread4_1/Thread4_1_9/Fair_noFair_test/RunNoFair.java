package Thread4_1.Thread4_1_9.Fair_noFair_test;

public class RunNoFair {

    public static void main(String[] args) {
        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("★线程"+Thread.currentThread().getName()+"运行了");
                service.serviceMethod();
            }
        };
        Thread[] threads = new Thread[10];
        for(int i=0;i<10;i++){
            threads[i] = new Thread(runnable);
        }
        for(int i=0;i<10;i++){
            threads[i].start();
        }
        /**
         * 先启动的线程不一定能获取到锁，不公平。
         * ★线程Thread-1运行了
         * ★线程Thread-4运行了
         * ★线程Thread-2运行了
         * ★线程Thread-0运行了
         * ★线程Thread-5运行了
         * ★线程Thread-3运行了
         * ThreadName=Thread-1获得锁定
         * ★线程Thread-7运行了
         * ThreadName=Thread-7获得锁定
         * ★线程Thread-8运行了
         * ThreadName=Thread-2获得锁定
         * ★线程Thread-6运行了
         * ThreadName=Thread-4获得锁定
         * ★线程Thread-9运行了
         * ThreadName=Thread-0获得锁定
         * ThreadName=Thread-5获得锁定
         * ThreadName=Thread-3获得锁定
         * ThreadName=Thread-8获得锁定
         * ThreadName=Thread-6获得锁定
         * ThreadName=Thread-9获得锁定
         */
    }
}
