package Thread1_7.Thread1_7_4.t14;

/**
 * 先sleep，再interrupt
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(200);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
        /**
         * 如果在sleep状态下停止线程会抛出InterruptedException异常，并且会清除中断标志，所以调用isInterrupt()方法返回false.
         * run begin
         * end
         * 在沉睡中被停止，进入catch~ false
         * java.lang.InterruptedException: sleep interrupted
         * 	at java.lang.Thread.sleep(Native Method)
         * 	at Thread1_7.Thread1_7_4.t14.MyThread.run(MyThread.java:8)
         */
    }
}
