package Thread1_7.Thread1_7_3.t13;

public class Run2 {
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
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
         *i = 159232
         * end~
         * 已经停止状态了！我要退出了~
         * for 循环之后的语句！
         */
    }
}
