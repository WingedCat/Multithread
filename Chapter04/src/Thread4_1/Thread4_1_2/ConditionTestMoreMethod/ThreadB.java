package Thread4_1.Thread4_1_2.ConditionTestMoreMethod;

public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service){
        this.service = service;
    }

    @Override
    public void run(){
        service.methodB();
    }
}
