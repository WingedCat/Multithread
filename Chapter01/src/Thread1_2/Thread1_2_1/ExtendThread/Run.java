package Thread1_2.Thread1_2_1.ExtendThread;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束~");
        /**
         * CPU随机调用两个线程（main线程和自定义线程）所以会出现下面的运行结果。线程的执行结果顺序和代码书写顺序是无关的。
         * 运行结束~
         * MyThread
         */
    }
}
