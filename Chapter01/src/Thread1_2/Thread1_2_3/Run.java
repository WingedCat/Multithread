package Thread1_2.Thread1_2_3;

public class Run {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");

        a.start();
        b.start();
        c.start();

        /**
         * 由C计算，count = 4
         * 由C计算，count = 3
         * 由A计算，count = 4
         * 由B计算，count = 4
         * 由A计算，count = 3
         * 由C计算，count = 2
         * 由C计算，count = 1
         * 由A计算，count = 2
         * 由B计算，count = 3
         * 由A计算，count = 1
         * 由C计算，count = 0
         * 由A计算，count = 0
         * 由B计算，count = 2
         * 由B计算，count = 1
         * 由B计算，count = 0
         * 共创建了3个线程，每个线程都有自己的count变量，自己减少自己的count变量的值。这个变量是不共享的，绝对不会导致线程安全问题。
         */
    }
}
