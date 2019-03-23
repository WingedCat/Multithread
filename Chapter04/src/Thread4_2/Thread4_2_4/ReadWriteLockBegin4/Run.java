package Thread4_2.Thread4_2_4.ReadWriteLockBegin4;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000);
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        /**
         * 写读互斥
         * 获得写锁B  1553331925119
         * 获得读锁A  1553331935119
         */
    }
}
