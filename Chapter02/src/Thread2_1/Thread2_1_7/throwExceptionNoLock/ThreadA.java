package Thread2_1.Thread2_1_7.throwExceptionNoLock;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
