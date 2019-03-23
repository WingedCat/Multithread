package Thread4_2.Thread4_2_3.ReadWriteLockBegin3;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        Thread.sleep(1000);
        ThreadB b = new ThreadB(service);
        b.setName("B");

        b.start();
        /**
         * 读写互斥
         * 获得读锁A  1553331886765
         * 获得写锁B  1553331896765
         */
    }
}
