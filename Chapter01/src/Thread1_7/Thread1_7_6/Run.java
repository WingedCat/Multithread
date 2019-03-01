package Thread1_7.Thread1_7_6;

/**
 * 调用stop()方法停止线程会抛出ThreadDeath异常，不过这个异常不需要我们显示捕捉
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        /**
         * 调用stop()方法抛出ThreadDeath异常，进入catch中了~
         * java.lang.ThreadDeath
         * 	at java.lang.Thread.stop(Thread.java:853)
         * 	at Thread1_7.Thread1_7_6.MyThread.run(MyThread.java:9)
         */
    }
}
