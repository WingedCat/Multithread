package Thread2_2.Thread2_2_5.doubleSynBlockOneTwo;


public class ThreadA extends Thread {
    private ObjectService service;
    public ThreadA(ObjectService service){
        this.service = service;
    }
    @Override
    public void run(){
        service.serviceMethodA();
    }
}
