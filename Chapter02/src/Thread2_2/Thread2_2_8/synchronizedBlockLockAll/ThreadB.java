package Thread2_2.Thread2_2_8.synchronizedBlockLockAll;

public class ThreadB extends Thread {
    private Service service;
    private MyObject object;

    public ThreadB(Service service, MyObject object){
        this.service = service;
        this.object = object;
    }

    @Override
    public void run(){
        service.testMethod1(object);
    }
}
