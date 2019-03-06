package Thread2_2.Thread2_2_8.test3;

public class ThreadA extends Thread {
    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object){
        this.service = service;
        this.object = object;
    }

    @Override
    public void run(){
        service.testMethod1(object);
    }
}
