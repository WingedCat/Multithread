package Thread2_3.Thread2_3_6.atomicIntegerNoSafe;

public class MyThread extends Thread {
    private MyService service;
    public MyThread(MyService service){
        this.service = service;
    }

    @Override
    public void run(){
        service.addNum();
    }
}
