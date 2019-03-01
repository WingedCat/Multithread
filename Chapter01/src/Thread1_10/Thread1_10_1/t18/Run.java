package Thread1_10.Thread1_10_1.t18;

public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority = "+Thread.currentThread().getPriority());
        System.out.println("main thread end priority = "+Thread.currentThread().getPriority());
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        /**
         * main thread begin priority = 5
         * main thread end priority = 5
         * MyThread1 run priority = 5
         * MyThread2 run priority = 5
         */
    }
}
