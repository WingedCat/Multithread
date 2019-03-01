package Thread1_11.daemonThread;

public class MyThread extends Thread {
    private int i=0;
    @Override
    public void run(){
        while(true){
            i++;
            System.out.println("i="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
