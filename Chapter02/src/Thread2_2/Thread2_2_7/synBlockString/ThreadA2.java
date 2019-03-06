package Thread2_2.Thread2_2_7.synBlockString;

public class ThreadA2 extends Thread {
    private Service2 service;

    public ThreadA2(Service2 service){
        this.service = service;
    }

    @Override
    public void run(){
        service.setUsernamePassword("a","aa");
    }
}
