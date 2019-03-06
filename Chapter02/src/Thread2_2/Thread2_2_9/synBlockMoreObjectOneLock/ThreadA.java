package Thread2_2.Thread2_2_9.synBlockMoreObjectOneLock;

public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        this.service = service;
    }
    @Override
    public void run(){
        service.printA();
    }
}
