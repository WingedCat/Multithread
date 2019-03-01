package Thread1_2.Thread1_2_3;

public class Run2 {
    public static void main(String[] args) {

        MyThread2 myThread2 = new MyThread2();
        Thread a = new Thread(myThread2,"A");
        Thread b = new Thread(myThread2,"B");
        Thread c = new Thread(myThread2,"C");
        Thread d = new Thread(myThread2,"D");
        Thread e = new Thread(myThread2,"E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

        /**
         * abcde相当于五个售票员在买票，那么每个人卖完一张票后票数应该是不一样的，可是由于线程安全问题，并不是如此：
         * 由D计算，count = 2
         * 由B计算，count = 1
         * 由E计算，count = 0
         * 由A计算，count = 2
         * 由C计算，count = 2
         *
         * i--不是原子性操作
         */
    }
}
