package Thread4_1.Thread4_1_13.tryLock_param;

public class Run {
    public static void main(String[] args) {
        final MyService service = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"调用waitMethod时间;"+System.currentTimeMillis());
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
        /**
         * A调用waitMethod时间;1553328120863
         * B调用waitMethod时间;1553328120863
         *      A获得锁的时间：1553328120864
         *      B没有获得锁
         */
    }
}
