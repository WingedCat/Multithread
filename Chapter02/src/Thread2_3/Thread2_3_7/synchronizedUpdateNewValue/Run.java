package Thread2_3.Thread2_3_7.synchronizedUpdateNewValue;

public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.start();
            Thread.sleep(5000);
            ThreadB b = new ThreadB(service);
            b.start();
            System.out.println("已经发起停止的命令了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * 同步synchronized不仅可以解决一个线程看到对象处于不一致的状态，还可以保证进入同步方法或同步代码块的每个线程都看到
         * 由同一个锁保护之前所有的修改效果。
         */
    }
}
