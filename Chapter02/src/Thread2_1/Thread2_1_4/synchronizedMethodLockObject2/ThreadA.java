package Thread2_1.Thread2_1_4.synchronizedMethodLockObject2;

public class ThreadA extends Thread {
    private MyObject object;

    public ThreadA(MyObject object){
        this.object = object;
    }

    @Override
    public void run(){
        object.methodA();
    }
}
