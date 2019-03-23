package Thread4_1.Thread4_1_2.ConditionTestMoreMethod;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");
        aa.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadBB bb = new ThreadBB(service);
        bb.setName("BB");
        bb.start();
        /**
         * methodA begin ThreadName=A  time=1552810266540
         * methodA end ThreadName=A  time=1552810271540
         * methodA begin ThreadName=AA  time=1552810271540
         * methodA end ThreadName=AA  time=1552810276540
         * methodB begin ThreadName=B  time=1552810276540
         * methodB end ThreadName=B  time=1552810281540
         * methodB begin ThreadName=BB  time=1552810281540
         * methodB end ThreadName=BB  time=1552810286541
         */
    }
}
