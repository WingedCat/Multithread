package Thread2_1.Thread2_1_4.synchronizedMethodLockObject2;

public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
    /**methodA()是同步方法，methodB()是普通方法，即使线程A持有object对象的锁，但是线程B完全可以异步调用非synchronized类型的方法methodB()
     * begin methodA threadName = A
     * begin methodB threadName = B
     * end methodA threadName = A
     * end methodB threadName = B
     */

    /**methodA()和methodB()都是同步方法，如果线程A先获得了object对象的锁，如果线程B调用同步方法，那么依旧需要进行等待
     * begin methodA threadName = A
     * end methodA threadName = A
     * begin methodB threadName = B
     * end methodB threadName = B
     */
}
