package Thread1_7.Thread1_7_6;

public class MyThread extends Thread {
    private int i=0;

    @Override
    public void run(){
        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("调用stop()方法抛出ThreadDeath异常，进入catch中了~");
            e.printStackTrace();
        }
    }
}
