package Thread2_1.Thread2_1_7.throwExceptionNoLock;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
