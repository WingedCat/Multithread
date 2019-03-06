package Thread2_1.Thread2_1_8.synNotExtends;

public class ThreadA extends Thread {
    private Sub sub;

    public ThreadA(Sub sub){
        this.sub = sub;
    }

    @Override
    public void run(){
        sub.serviceMethod();
    }
}
