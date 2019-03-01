package Thread1_8.Thread1_8_2.suspend_resume_LockStop;

public class MyThread extends Thread {
    private long i = 0;
    @Override
    public void run(){
        while(true){
            i++;
        }
    }
}
