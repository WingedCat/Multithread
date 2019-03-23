package Thread4_1.Thread4_1_1.ReentrantLockTest;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread t1 = new MyThread(service);
        MyThread t2 = new MyThread(service);
        MyThread t3 = new MyThread(service);
        MyThread t4 = new MyThread(service);
        MyThread t5 = new MyThread(service);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        /**
         * ThreadName=Thread-0  1
         * ThreadName=Thread-0  2
         * ThreadName=Thread-0  3
         * ThreadName=Thread-0  4
         * ThreadName=Thread-0  5
         * ThreadName=Thread-2  1
         * ThreadName=Thread-2  2
         * ThreadName=Thread-2  3
         * ThreadName=Thread-2  4
         * ThreadName=Thread-2  5
         * ThreadName=Thread-1  1
         * ThreadName=Thread-1  2
         * ThreadName=Thread-1  3
         * ThreadName=Thread-1  4
         * ThreadName=Thread-1  5
         * ThreadName=Thread-4  1
         * ThreadName=Thread-4  2
         * ThreadName=Thread-4  3
         * ThreadName=Thread-4  4
         * ThreadName=Thread-4  5
         * ThreadName=Thread-3  1
         * ThreadName=Thread-3  2
         * ThreadName=Thread-3  3
         * ThreadName=Thread-3  4
         * ThreadName=Thread-3  5
         */
    }
}
