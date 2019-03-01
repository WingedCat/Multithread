package Thread1_2.Thread1_2_2.ImplThreadUserRunnable;

public class Run {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("main运行结束~");
        /**
         * main运行结束~
         * 运行中~
         * 效果和直接继承Thread实现线程是一样的，但是由于java只支持单继承，所以我们推荐使用实现runnable接口的方法实现线程
         */

        /**
         * 实际上Thread类实现了Runnable接口
         public class Thread implements Runnable{
            ……
         }
         */
    }
}
