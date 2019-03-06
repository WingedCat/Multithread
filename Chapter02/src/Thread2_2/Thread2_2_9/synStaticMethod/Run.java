package Thread2_2.Thread2_2_9.synStaticMethod;

public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
    }
    /**
     * 线程名称为：A在1551612491348进入printA
     * 线程名称为：A在1551612494349离开printA
     * 线程名称为：B在1551612494349进入printB
     * 线程名称为：B在1551612494349离开printB
     *
     * 单纯从运行结果看并没有什么特别之处，都是同步的效果，与将synchronized加到非static方法上的效果是一样的，
     * 实际上这有着本质的不同，synchronized加到static静态方法上是给Class类上锁，而synchronized关键字加到非
     * static静态方法上是给对象上锁。
     */
}
