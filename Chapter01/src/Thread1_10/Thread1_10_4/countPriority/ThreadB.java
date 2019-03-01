package Thread1_10.Thread1_10_4.countPriority;

public class ThreadB extends Thread {
    private int count = 0;

    public int getCount(){
        return count;
    }
    @Override
    public void run(){
        while(true){
            count++;
        }
    }
}
