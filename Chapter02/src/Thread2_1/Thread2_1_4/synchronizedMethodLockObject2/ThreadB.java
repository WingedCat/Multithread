package Thread2_1.Thread2_1_4.synchronizedMethodLockObject2;

public class ThreadB extends Thread {
    private MyObject object;

    public ThreadB(MyObject object){
        this.object = object;
    }

    @Override
    public void run(){
        object.methodB();
    }
}
