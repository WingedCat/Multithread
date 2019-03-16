package Thread3_2.Thread3_2_5.join_sleep_1;

public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB threadB){
        this.b = threadB;
    }

    @Override
    public void run(){
        try {
            synchronized (b){
                b.start();
                Thread.sleep(6000);
            };
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
