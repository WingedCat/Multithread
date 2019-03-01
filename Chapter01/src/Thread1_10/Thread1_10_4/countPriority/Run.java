package Thread1_10.Thread1_10_4.countPriority;

public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setPriority(Thread.NORM_PRIORITY - 3);
        a.start();
        ThreadB b = new ThreadB();
        b.setPriority(Thread.NORM_PRIORITY + 3);
        b.start();
        try {
            Thread.sleep(20000);
            a.stop();
            b.stop();
            System.out.println("a = "+ a.getCount());
            System.out.println("b = "+ b.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * a = 1668987882
         * b = 1705589054
         */
    }
}
