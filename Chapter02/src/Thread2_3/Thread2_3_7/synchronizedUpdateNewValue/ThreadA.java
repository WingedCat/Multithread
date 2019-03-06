package Thread2_3.Thread2_3_7.synchronizedUpdateNewValue;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run(){
        service.runMethod();
    }
}
