package Thread4_1.Thread4_1_15.awaitUntilTest;

public class MyThreadA extends Thread {
    private Service service;

    public MyThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run(){
        service.waitMethod();
    }
}
