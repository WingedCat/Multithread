package Thread2_2.Thread2_2_10.StringAndSyn2;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run(){
        service.print(new Object());
    }
}
