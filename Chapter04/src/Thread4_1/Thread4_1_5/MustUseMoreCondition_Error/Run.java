package Thread4_1.Thread4_1_5.MustUseMoreCondition_Error;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.signAll();
        /**唤醒了所有的线程，我想只唤醒部分线程怎么办？这需要使用多个condition
         * begin awaitA的时间为：1552812193009 ThreadName=A
         * begin awaitB的时间为：1552812193009 ThreadName=B
         * signAll的时间为：1552812196010
         * end awaitA的时间为：1552812196010 ThreadName=A
         * end awaitB的时间为：1552812196010 ThreadName=B
         */
    }
}
