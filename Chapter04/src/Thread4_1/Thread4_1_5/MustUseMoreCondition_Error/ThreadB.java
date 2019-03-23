package Thread4_1.Thread4_1_5.MustUseMoreCondition_Error;

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
