package Thread1_5;

public class Run1{
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin = "+ System.currentTimeMillis());
//        myThread1.run();
        myThread1.start();
        System.out.println("end = "+ System.currentTimeMillis());
        /**
         * 直接调用run()方法：
         * begin = 1551423449439
         * run threadName = main begin
         * run threadName = main end
         * end = 1551423451440
         */

        /**
         * 调用start()方法：
         * begin = 1551423477747
         * end = 1551423477747
         * run threadName = Thread-0 begin
         * run threadName = Thread-0 end
         */
    }
}
