package Thread3_1.Thread3_1_3.test2;

public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            t1.start();
            Thread.sleep(3000);
            MyThread2 t2 = new MyThread2(lock);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * 开始 wait time=1552297906223
         * 开始 notify time=1552297909223
         * 结束 notify time=1552297909223
         * 结束 wait time=1552297909223
         */
    }
}
