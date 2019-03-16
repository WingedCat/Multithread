package Thread3_1.Thread3_1_4.notifyHoldLock;


public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock){
        this.lock = lock;
    }

    @Override
    public void run(){
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
