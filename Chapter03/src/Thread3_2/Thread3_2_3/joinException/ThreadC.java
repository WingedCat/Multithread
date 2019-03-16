package Thread3_2.Thread3_2_3.joinException;

public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB){
        this.threadB = threadB;
    }

    @Override
    public void run(){
        threadB.interrupt();
    }
}
