package Thread2_2.Thread2_2_9.synTwoLock;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();
        /**
         * 线程C是异步执行的，因为它的是对象锁，和A,B线程的Class锁不同
         * 线程名称为：A在1551616608155进入printA
         * 线程名称为：C在1551616608156进入printC
         * 线程名称为：C在1551616608156离开printC
         * 线程名称为：A在1551616611155离开printA
         * 线程名称为：B在1551616611155进入printB
         * 线程名称为：B在1551616611155离开printB
         */
    }
}
