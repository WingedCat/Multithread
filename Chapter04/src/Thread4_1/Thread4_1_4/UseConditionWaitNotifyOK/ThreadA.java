package Thread4_1.Thread4_1_4.UseConditionWaitNotifyOK;

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service){
        this.service = service;
    }

    @Override
    public void run(){
        service.await();
    }
}
