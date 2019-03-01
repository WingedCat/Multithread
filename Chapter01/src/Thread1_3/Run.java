package Thread1_3;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        /**
         * MyThread 构造方法运行~ ：main
         * run 运行~：Thread-0
         * 如果myThread直接调用run方法，那么将由main线程调用此方法。
         */
    }
}
