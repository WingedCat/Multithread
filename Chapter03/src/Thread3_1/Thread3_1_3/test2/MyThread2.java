package Thread3_1.Thread3_1_3.test2;

public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock){
        this.lock = lock;
    }

    @Override
    public void run(){
        synchronized (lock){
            System.out.println("开始 notify time="+System.currentTimeMillis());
            lock.notify();
            System.out.println("结束 notify time="+System.currentTimeMillis());
        }
    }
}
