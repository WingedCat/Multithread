package Thread2_2.Thread2_2_10.StringAndSyn2;

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
         * 两个线程持有不同的锁，交替执行
         * A
         * B
         * A
         * B
         * A
         * B
         * ……
         */
    }
}
