package Thread4_1.Thread4_1_13.tryLockTest;

public class Run {
    public static void main(String[] args) {
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
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
        /**
         * A获得锁
         * B没有获得锁
         */
    }
}
