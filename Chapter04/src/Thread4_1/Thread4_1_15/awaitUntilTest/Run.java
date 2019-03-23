package Thread4_1.Thread4_1_15.awaitUntilTest;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
        /**等待来了10s，自动唤醒
         * wait begin timer=1553329291874
         * wait end timer=1553329301864
         */
    }
}
