package Thread1_2.Thread1_2_3;

/**
 * 实例变量与线程安全
 * 共享数据的情况，不设置同步会导致线程安全问题
 * 现在我们将run()方法设置同步
 */
public class MyThread3 extends Thread{
    private int count = 5;

    @Override
    synchronized public void run(){
        count--;
        System.out.println("由" + Thread.currentThread().getName() + "计算，count = " + count);
    }

}
