package Thread2_2.Thread2_2_11.twoStop;

public class Run2 {
    public static void main(String[] args) {
        Service2 service = new Service2();
        ThreadA2 athread = new ThreadA2(service);
        athread.start();
        ThreadB2 bthread = new ThreadB2(service);
        bthread.start();
        /**
         * methodA begin
         * methodB begin
         * methodB end
         */
    }
}
