package Thread4_1.Thread4_1_6.MustUseMoreCondition_OK;

public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service){
        this.service = service;
    }

    @Override
    public void run(){
        service.awaitB();
    }
}
