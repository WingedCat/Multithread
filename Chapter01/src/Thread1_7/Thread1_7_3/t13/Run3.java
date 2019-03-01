package Thread1_7.Thread1_7_3.t13;

public class Run3 {
    public static void main(String[] args) {
        MyThread3 myThread = new MyThread3();
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
         *i = 156333
         * i = 156334
         * end~
         * 已经停止状态了！我要退出了~
         * 进入catch中了~
         * java.lang.InterruptedException
         * 	at Thread1_7.Thread1_7_3.t13.MyThread3.run(MyThread3.java:14)
         */
    }
}
