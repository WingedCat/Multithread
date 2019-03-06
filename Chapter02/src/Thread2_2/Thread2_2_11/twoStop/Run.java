package Thread2_2.Thread2_2_11.twoStop;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA athread = new ThreadA(service);
        athread.start();
        ThreadB bthread = new ThreadB(service);
        bthread.start();
        /**
         * methodA begin
         * 死循环
         * 线程B永远得不到执行
         */
    }
}
