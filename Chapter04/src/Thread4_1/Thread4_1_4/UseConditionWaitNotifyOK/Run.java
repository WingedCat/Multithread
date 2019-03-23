package Thread4_1.Thread4_1_4.UseConditionWaitNotifyOK;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();
        /**
         * await的时间为：1552811858765
         * signal的时间为：1552811861764
         */
    }
}
