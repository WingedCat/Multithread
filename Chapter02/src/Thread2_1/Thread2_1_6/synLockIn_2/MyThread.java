package Thread2_1.Thread2_1_6.synLockIn_2;

public class MyThread extends Thread {
    @Override
    public void run(){
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
