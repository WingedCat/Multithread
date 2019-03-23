package Thread4_1.Thread4_1_14.awaitUninterruptiblyTest_1;

public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread thread = new MyThread(service);
            thread.start();
            Thread.sleep(3000);
            thread.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * wait begin
         * java.lang.InterruptedException
         * 	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.reportInterruptAfterWait(AbstractQueuedSynchronizer.java:2014)
         * 	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2048)
         * 	at Thread4_1.Thread4_1_14.awaitUninterruptiblyTest_1.Service.testMethod(Service.java:14)
         * 	at Thread4_1.Thread4_1_14.awaitUninterruptiblyTest_1.MyThread.run(MyThread.java:11)
         * catch
         */
    }
}
