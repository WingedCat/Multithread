package Thread4_1.Thread4_1_10.lockMethodTest1.test3;

public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for(int i=0;i<10;i++){
            threadArray[i] = new Thread(runnable);
        }
        for(int i=0;i<10;i++){
            threadArray[i].start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.notifyMethod();
        /**
         * 有10个线程正在等待condition
         */
    }
}
