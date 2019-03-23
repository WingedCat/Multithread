package Thread4_1.Thread4_1_1.ReentrantLockTest;

public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service){
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
