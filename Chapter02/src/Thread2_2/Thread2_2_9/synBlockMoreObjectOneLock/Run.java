package Thread2_2.Thread2_2_9.synBlockMoreObjectOneLock;

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
         * 同步synchronized(class)代码块作用哈synchronized static方法作用一样
         * 线程名称为：A在1551617112830进入printA
         * 线程名称为：A在1551617115831离开printA
         * 线程名称为：B在1551617115831进入printB
         * 线程名称为：B在1551617115831离开printB
         */
    }
}
