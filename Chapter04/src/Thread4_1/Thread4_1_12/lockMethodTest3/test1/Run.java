package Thread4_1.Thread4_1_12.lockMethodTest3.test1;

public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        final Service service2 = new Service(false);
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                service2.serviceMethod();
            }
        };
        Thread thread2 = new Thread(runnable2);
        thread2.start();
        /**
         * 公平锁情况：true
         * 公平锁情况：false
         */
    }
}
