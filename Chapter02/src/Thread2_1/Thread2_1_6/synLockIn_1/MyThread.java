package Thread2_1.Thread2_1_6.synLockIn_1;

public class MyThread extends Thread {
    @Override
    public void run(){
        Service service = new Service();
        service.service1();
    }
}
