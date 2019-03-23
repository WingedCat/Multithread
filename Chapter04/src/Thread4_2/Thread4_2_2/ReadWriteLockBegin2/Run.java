package Thread4_2.Thread4_2_2.ReadWriteLockBegin2;

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
         * 写锁互斥
         * 获得写锁A  1553331485844
         * 获得写锁B  1553331495845
         */
    }
}
