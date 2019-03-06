package Thread2_2.Thread2_2_9.synStaticMethod;

public class ThreadA extends Thread {
    @Override
    public void run(){
        Service.printA();
    }
}
