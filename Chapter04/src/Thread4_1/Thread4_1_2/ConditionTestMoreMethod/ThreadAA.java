package Thread4_1.Thread4_1_2.ConditionTestMoreMethod;

public class ThreadAA extends Thread {
    private MyService service;

    public ThreadAA(MyService service){
        this.service = service;
    }

    @Override
    public void run(){
        service.methodA();
    }
}
