package Thread2_1.Thread2_1_4.synchronizedMethodLockObject;

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
    /**
     * 为加synchronized前：
     * begin methodA threadName = A
     * begin methodA threadName = B
     * end methodA threadName = B
     * end methodA threadName = A
     * 两个线程可一同进入methodA
     */

    /**
     * 加了synchronized后顺序执行：
     * begin methodA threadName = A
     * end methodA threadName = A
     * begin methodA threadName = B
     * end methodA threadName = B
     */
}
