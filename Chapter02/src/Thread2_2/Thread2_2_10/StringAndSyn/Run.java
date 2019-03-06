package Thread2_2.Thread2_2_10.StringAndSyn;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        /**
         * 由于String常量池的原因，两个线程持有相同的锁，线程B不能执行
         * A
         * A
         * A
         * A
         * A
         * A
         * ……
         */
    }
}
