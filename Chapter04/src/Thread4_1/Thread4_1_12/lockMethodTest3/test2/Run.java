package Thread4_1.Thread4_1_12.lockMethodTest3.test2;

public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        /**
         * false
         * true
         */
    }
}
