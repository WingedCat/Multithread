package Thread4_1.Thread4_1_15.awaitUntilTest;

public class MyThreadB extends Thread {
    private Service service;

    public MyThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run(){
        service.notifyMethod();
    }
}
