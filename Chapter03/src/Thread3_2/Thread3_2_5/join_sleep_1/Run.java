package Thread3_2.Thread3_2_5.join_sleep_1;

public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * b run begin time=1552737808049
         * b run end time=1552737813049
         * 打印了 bService time=1552737814049
         */
        /**
         * 由于ThreadA使用Thread.sleep()方法一直持有ThradB对象的锁，时间达到6秒，所以线程C只有在ThreadA时间到达6秒后释放
         * ThreadB的锁时，才可以调用ThreadB中的同步方法。
         */
    }
}
