package Thread4_1.Thread4_1_14.awaitUninterruptiblyTest_1;

public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service){
        this.service = service;
    }
    @Override
    public void run(){
        service.testMethod();
    }
}
