package Thread2_2.Thread2_2_6.t8;

public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
        /**
         * othermethod()非同步方法，异步打印
         * synchronized threadName = Thread-0  i=6298
         * ---------------run ---otherMethod
         * synchronized threadName = Thread-0  i=6299
         * synchronized threadName = Thread-0  i=6300
         * synchronized threadName = Thread-0  i=6301
         */

        /**othermethod()为同步方法，同步打印
         * synchronized threadName = Thread-0  i=9998
         * synchronized threadName = Thread-0  i=9999
         * synchronized threadName = Thread-0  i=10000
         * ---------------run ---otherMethod
         */
    }
}
