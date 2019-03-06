package Thread2_3.Thread2_3_5.AtomicIntegerTest;

public class Run {
    public static void main(String[] args) {
        AddCountThread thread = new AddCountThread();
        Thread t1 = new Thread(thread);
        t1.start();
        Thread t2 = new Thread(thread);
        t2.start();
        Thread t3 = new Thread(thread);
        t3.start();
        Thread t4 = new Thread(thread);
        t4.start();
        Thread t5 = new Thread(thread);
        t5.start();
        /**
         * 49996
         * 49997
         * 49998
         * 49999
         * 50000
         */
    }
}
