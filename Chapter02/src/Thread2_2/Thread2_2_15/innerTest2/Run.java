package Thread2_2.Thread2_2_15.innerTest2;

import Thread2_2.Thread2_2_15.innerTest2.OutClass.InnerClass1;
import Thread2_2.Thread2_2_15.innerTest2.OutClass.InnerClass2;

public class Run {
    public static void main(String[] args) {
        final InnerClass1 in1 = new InnerClass1();
        final InnerClass2 in2 = new InnerClass2();
        Thread t1 = new Thread(()->{
            in1.method1(in2);
        },"A");
        Thread t2 = new Thread(()->{
            in1.method2();
        },"B");
        Thread t3 = new Thread(()->{
            in2.method1();
        },"C");
        t1.start();
        t2.start();
        t3.start();
        /**
         * A 进入InnerClass1类的method1方法
         * B 进入InnerClass1类的method2方法
         * i=1
         * j=11
         * j=12
         * i=2
         * j=13
         * i=3
         * i=4
         * j=14
         * j=15
         * i=5
         * j=16
         * i=6
         * i=7
         * j=17
         * i=8
         * j=18
         * i=9
         * j=19
         * i=10
         * j=20
         * A 离开InnerClass1类的method1方法
         * B 离开InnerClass1类的method2方法
         * C 进入InnerClass2类的method1方法
         * k=0
         * k=1
         * k=2
         * k=3
         * k=4
         * k=5
         * k=6
         * k=7
         * k=8
         * k=9
         * k=10
         * C 离开InnerClass2类的method1方法
         * 线程A中因为method1方法对in2进行了加锁，所以线程C只能以同步的方式调用内部方法
         */
    }
}
