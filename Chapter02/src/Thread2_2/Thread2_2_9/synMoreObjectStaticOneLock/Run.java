package Thread2_2.Thread2_2_9.synMoreObjectStaticOneLock;

public class Run {
    public static void main(String[] args) {
        /**
         * Class锁对类的所有实例起作用
         */
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA a = new ThreadA(service1);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service2);
        b.setName("B");
        b.start();
        /**
         * 同步执行
         * 线程名称为：A在1551616854877进入printA
         * 线程名称为：A在1551616857878离开printA
         * 线程名称为：B在1551616857878进入printB
         * 线程名称为：B在1551616857878离开printB
         */
    }
}
