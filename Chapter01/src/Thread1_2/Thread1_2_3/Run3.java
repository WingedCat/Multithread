package Thread1_2.Thread1_2_3;

public class Run3 {
    public static void main(String[] args) {

        MyThread3 myThread3 = new MyThread3();
        Thread a = new Thread(myThread3,"A");
        Thread b = new Thread(myThread3,"B");
        Thread c = new Thread(myThread3,"C");
        Thread d = new Thread(myThread3,"D");
        Thread e = new Thread(myThread3,"E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

        /**
         * 将run方法设置为同步后解决了线程安全问题，这几个线程必须顺序进行
         * 由A计算，count = 4
         * 由E计算，count = 3
         * 由D计算，count = 2
         * 由C计算，count = 1
         * 由B计算，count = 0
         */
    }
}
