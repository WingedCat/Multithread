package Thread1_8.Thread1_8_1.suspend_resume_test;

public class MyThread extends Thread {
    private long i=0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run(){
        while(true){
            i++;
        }
    }
}
