package Thread2_2.Thread2_2_7.synBlockString;

public class Run2 {
    public static void main(String[] args) {
        Service2 service = new Service2();
        ThreadA2 a = new ThreadA2(service);
        a.setName("A");
        a.start();
        ThreadB2 b = new ThreadB2(service);
        b.setName("B");
        b.start();
        /**
         * anyString是两个方法中私有的，所以获得的不是同一个锁，所以导致异步执行
         * 线程名称为：A 在1551604430524进入同步块
         * 线程名称为：B 在1551604430525进入同步块
         * 线程名称为：A 在1551604433526离开同步块
         * 线程名称为：B 在1551604433526离开同步块
         */
    }
}
