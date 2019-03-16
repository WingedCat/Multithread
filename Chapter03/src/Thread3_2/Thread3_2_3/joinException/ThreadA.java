package Thread3_2.Thread3_2_3.joinException;

public class ThreadA extends Thread {
    @Override
    public void run(){
        for(int i=0;i<Integer.MAX_VALUE;i++){
            String newString = new String();
            Math.random();
        }
    }
}
