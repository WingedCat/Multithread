package Thread4_1.Thread4_1_11.lockMethodTest2.test2;

public class Run {
    public static void main(String[] args) throws InterruptedException {
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
        for (int i=0;i<10;i++){
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
        /**
         * 有没有线程正在等待condition？true  线程数是多少？10
         */
    }
}
