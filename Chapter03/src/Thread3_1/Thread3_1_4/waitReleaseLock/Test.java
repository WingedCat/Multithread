package Thread3_1.Thread3_1_4.waitReleaseLock;

public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
        /**
         * begin wait
         * begin wait
         * 两个线程都进来了说明wait调用后会释放锁
         */

        /**sleep不释放锁
         * begin wait
         * end wait
         * begin wait
         * end wait
         */
    }
}
