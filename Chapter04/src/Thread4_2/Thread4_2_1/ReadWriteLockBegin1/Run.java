package Thread4_2.Thread4_2_1.ReadWriteLockBegin1;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
        /**
         * 同时获得读锁
         * 获得读锁A  1553331255598
         * 获得读锁B  1553331255598
         */
    }
}
