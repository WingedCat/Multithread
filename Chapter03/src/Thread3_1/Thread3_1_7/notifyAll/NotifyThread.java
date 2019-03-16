package Thread3_1.Thread3_1_7.notifyAll;

public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock){
        this.lock = lock;
    }
    @Override
    public void run(){
        synchronized (lock){
            lock.notifyAll();
        }
    }
}
