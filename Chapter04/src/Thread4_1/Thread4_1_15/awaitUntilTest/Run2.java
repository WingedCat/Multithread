package Thread4_1.Thread4_1_15.awaitUntilTest;

public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
        Thread.sleep(2000);
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.start();
        /**没有等待设置的时间被其他线程唤醒
         * wait begin timer=1553329392392
         * notify begin timer=1553329394374
         * notify end timer=1553329394374
         * wait end timer=1553329394374
         */
    }
}
