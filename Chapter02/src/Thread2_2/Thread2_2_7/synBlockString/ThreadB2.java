package Thread2_2.Thread2_2_7.synBlockString;

public class ThreadB2 extends Thread {
    private Service2 service;

    public ThreadB2(Service2 service){
        this.service = service;
    }

    @Override
    public void run(){
        service.setUsernamePassword("b","bb");
    }

}
