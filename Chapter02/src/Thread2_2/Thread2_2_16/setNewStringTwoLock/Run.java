package Thread2_2.Thread2_2_16.setNewStringTwoLock;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        Thread a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        b.start();
        /**
         * 存在50ms的延迟情况下：线程A先获取到锁“123”
         * A begin 1551792303262
         * B begin 1551792303312  → 锁由原来的“123”变成了“456”
         * A end 1551792305263
         * B end 1551792305313
         */

        /**
         * 不存在50ms的延迟情况下：结果是同步的，因为两个线程争夺的锁都是“123”
         * A begin 1551792454270
         * A end 1551792456270
         * B begin 1551792456270
         * B end 1551792458271
         */
    }
}
