package Thread2_2.Thread2_2_11.twoStop;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run(){
        service.methodA();
    }
}
