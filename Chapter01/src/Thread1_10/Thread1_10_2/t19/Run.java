package Thread1_10.Thread1_10_2.t19;

public class Run {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            MyThread1 thread1 = new MyThread1();
            thread1.setPriority(10);
            thread1.start();
            MyThread2 thread2 = new MyThread2();
            thread2.setPriority(1);
            thread2.start();
            /**
             * ☆☆☆☆☆☆☆thread 2 user time = 37
             * ★★★★★★★☆☆☆☆☆☆☆thread 1 user time = 49
             * ☆☆☆☆☆☆☆thread 2 user time = 48
             * ★★★★★★★☆☆☆☆☆☆☆thread 1 user time = 52
             * ★★★★★★★☆☆☆☆☆☆☆thread 1 user time = 53
             * ★★★★★★★☆☆☆☆☆☆☆thread 1 user time = 52
             * ★★★★★★★☆☆☆☆☆☆☆thread 1 user time = 53
             * ☆☆☆☆☆☆☆thread 2 user time = 55
             * ☆☆☆☆☆☆☆thread 2 user time = 55
             * ☆☆☆☆☆☆☆thread 2 user time = 57
             * 高优先级的线程总是大部分先执行完，但是这不是意味着高优先级的线程全部先执行完。
             */
        }
    }
}
