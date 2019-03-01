package Thread1_3;

/**
 * currentThread()方法返回代码段正在被哪个线程调用的信息。
 */
public class MyThread extends Thread {
    public MyThread(){
        System.out.println("MyThread 构造方法运行~ ："+ Thread.currentThread().getName());
    }
    @Override
    public void run(){
        System.out.println("run 运行~：" + Thread.currentThread().getName());
    }
}
