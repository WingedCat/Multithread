package Thread1_2.Thread1_2_4;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        Thread t4 = new Thread(myThread);
        Thread t5 = new Thread(myThread);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        /**
         * 依旧出现了线程安全问题，因为i--是在进入println()之前发生的
         * i = 4ThreadName = Thread-3
         * i = 5ThreadName = Thread-2
         * i = 2ThreadName = Thread-5
         * i = 3ThreadName = Thread-4
         * i = 5ThreadName = Thread-1
         */
    }
}
