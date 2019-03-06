package Thread2_2.Thread2_2_7.synBlockString2;

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
         * 同步代码块的锁对象是anyString,同步方法的所对象是this对象，互不影响，所以是异步执行。
         * a begin
         * b begin
         * b end
         * a end
         */
    }
}
