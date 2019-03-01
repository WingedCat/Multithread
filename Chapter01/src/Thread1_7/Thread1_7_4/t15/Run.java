package Thread1_7.Thread1_7_4.t15;

/**
 * 先interrupt，再sleep
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        System.out.println("end");
        /**
         * i = 998
         * i = 999
         * i = 1000
         * run begin
         * 先停止，再遇到sleep，进入catch~
         * java.lang.InterruptedException: sleep interrupted
         * 	at java.lang.Thread.sleep(Native Method)
         * 	at Thread1_7.Thread1_7_4.t15.MyThread.run(MyThread.java:12)
         */
    }
}
