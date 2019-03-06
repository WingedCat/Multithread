package Thread2_2.Thread2_2_16.setNewStringTwoLock;

public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service){
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
