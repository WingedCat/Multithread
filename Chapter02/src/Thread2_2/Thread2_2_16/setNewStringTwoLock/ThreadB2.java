package Thread2_2.Thread2_2_16.setNewStringTwoLock;

public class ThreadB2 extends Thread {
    private Service service;
    private User user;

    public ThreadB2(Service service,User user){
        this.service = service;
        this.user = user;
    }

    @Override
    public void run(){
        service.serviceMethodA(user);
    }
}
