package Thread3_1.Thread3_1_4.notifyHoldLock;


public class synNotifyMethodThread extends Thread {
    private Object lock;

    public synNotifyMethodThread(Object lock){
        this.lock = lock;
    }

    @Override
    public void run(){
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
