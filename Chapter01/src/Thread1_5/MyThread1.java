package Thread1_5;

/**
 * sleep()使线程休眠
 */
public class MyThread1 extends Thread {
    @Override
    public void run(){
        try{
            System.out.println("run threadName = "+Thread.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName = "+ Thread.currentThread().getName() + " end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
