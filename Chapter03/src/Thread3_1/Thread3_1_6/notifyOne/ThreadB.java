package Thread3_1.Thread3_1_6.notifyOne;

public class ThreadB extends Thread {
    private Object lock;
    public ThreadB(Object lock){
        this.lock = lock;
    }

    @Override
    public void run(){
        Service service = new Service();
        service.testMethod(lock);
    }
}
