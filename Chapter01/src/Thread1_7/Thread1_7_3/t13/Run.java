package Thread1_7.Thread1_7_3.t13;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(1000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end~");
        /**
         * i = 141582
         * i = 141583
         * end~
         * 已经停止状态了！我要退出了~
         * 虽然停止了线程，break出了for循环，但是，如果for循环后面还有语句还是会继续运行下去的。
         */
    }
}
