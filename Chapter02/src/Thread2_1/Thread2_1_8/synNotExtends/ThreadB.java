package Thread2_1.Thread2_1_8.synNotExtends;

public class ThreadB extends Thread {
    private Sub sub;

    public ThreadB(Sub sub){
        this.sub = sub;
    }

    @Override
    public void run(){
        sub.serviceMethod();
    }
}
