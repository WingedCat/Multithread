package Thread4_1.Thread4_1_6.MustUseMoreCondition_OK;

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
        service.signAll_A();
        /**只唤醒了线程A。
         * begin awaitA的时间为：1552812404342 ThreadName=A
         * begin awaitB的时间为：1552812404342 ThreadName=B
         * signAll_A的时间为：1552812407343
         * end awaitA的时间为：1552812407343 ThreadName=A
         */
    }
}
