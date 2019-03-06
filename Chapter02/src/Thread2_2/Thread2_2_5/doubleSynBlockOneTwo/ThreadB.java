package Thread2_2.Thread2_2_5.doubleSynBlockOneTwo;

public class ThreadB extends Thread {
    private ObjectService service;
    public ThreadB(ObjectService service){
        this.service = service;
    }
    @Override
    public void run(){
        service.serviceMethodB();
    }
}
