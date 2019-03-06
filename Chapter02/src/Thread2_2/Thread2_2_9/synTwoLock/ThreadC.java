package Thread2_2.Thread2_2_9.synTwoLock;

public class ThreadC extends Thread {
    private Service service;

    public ThreadC(Service service){
        this.service = service;
    }
    @Override
    public void run(){
        service.printC();
    }
}
