package Thread3_2.Thread3_2_2.joinTest2;

import Thread3_2.Thread3_2_1.joinTest1.MyThread;

public class Test {
    public static void main(String[] args) {
        MyThread threadTest = new MyThread();
        threadTest.start();
        try {
            threadTest.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("threadTest对象执行完毕后我再执行");
    }
    /**
     * 963
     * threadTest对象执行完毕后我再执行
     */

    /**
     * 方法join的作用是使所属线程对象x正常执行run()方法中的任务，而使当前线程z进行无限期的阻塞，等待线程x销毁后再继续执行线程z后面的代码。
     */
}
