package Thread2_3.Thread2_3_7.synchronizedUpdateNewValue;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run(){
        service.stopMethod();
    }
}
