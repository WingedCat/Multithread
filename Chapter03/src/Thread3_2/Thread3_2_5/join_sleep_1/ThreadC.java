package Thread3_2.Thread3_2_5.join_sleep_1;

public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB){
        this.threadB = threadB;
    }

    @Override
    public void run(){
        threadB.bSerevice();
    }
}
