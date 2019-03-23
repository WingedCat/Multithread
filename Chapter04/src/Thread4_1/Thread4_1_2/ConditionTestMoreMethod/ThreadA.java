package Thread4_1.Thread4_1_2.ConditionTestMoreMethod;

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service){
        this.service = service;
    }

    @Override
    public void run(){
        service.methodA();
    }
}
