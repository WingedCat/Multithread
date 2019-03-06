package Thread2_2.Thread2_2_2.synchronizedOneThreaIn;

public class ThreadB extends Thread {
    private ObjectService service;
    public ThreadB(ObjectService service){
        this.service = service;
    }
    @Override
    public void run(){
        service.serviceMethod();
    }
}
