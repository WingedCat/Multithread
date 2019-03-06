package Thread2_2.Thread2_2_14.innerTest1;

import Thread2_2.Thread2_2_14.innerTest1.OutClass.Inner;

public class Run {
    public static void main(String[] args) {
        final Inner inner = new Inner();
        Thread t1 = new Thread(()->{
            inner.method1();
        },"A");
        Thread t2 = new Thread(()->{
            inner.method2();
        },"B");
        t1.start();
        t2.start();
        /**
         * 持有不同的锁，所以是乱序的
         * A i=1
         * B i=11
         * B i=12
         * A i=2
         * B i=13
         * A i=3
         * A i=4
         * B i=14
         * A i=5
         * B i=15
         * B i=16
         * A i=6
         * B i=17
         * A i=7
         * A i=8
         * B i=18
         * B i=19
         * A i=9
         * B i=20
         * A i=10
         */
    }
}
