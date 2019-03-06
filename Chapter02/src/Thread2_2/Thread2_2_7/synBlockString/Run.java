package Thread2_2.Thread2_2_7.synBlockString;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        /**
         * 线程名称为：A 在1551604047188进入同步块
         * 线程名称为：A 在1551604050188离开同步块
         * 线程名称为：B 在1551604050188进入同步块
         * 线程名称为：B 在1551604053189离开同步块
         */
    }
}
