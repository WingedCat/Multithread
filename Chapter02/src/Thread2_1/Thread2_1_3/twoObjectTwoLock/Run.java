package Thread2_1.Thread2_1_3.twoObjectTwoLock;

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef1);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef2);
        threadB.start();
        /**
         * 两个线程分别访问同一个类的两个不同实例的相同名称的同步方法，由于是两个不同的索，所以是异步进行的。
         */

        /**
         * 此处关键字synchronized获得的是对象所，而不是把一段代码或方法（函数）当作锁，
         * 所以在上面的示例中，哪个线程先执行带synchronized关键字的方法，哪个线程就持有该方法所属对象的锁Lock，
         * 那么其他线程只能呈等待状态，前提是多个线程访问的是同一个对象（即使用同一把锁）
         *
         * 如果多个线程访问多个对象，则JVM会创建多个锁。
         */
    }
}
