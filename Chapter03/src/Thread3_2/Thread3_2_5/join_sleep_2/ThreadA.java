package Thread3_2.Thread3_2_5.join_sleep_2;

public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB threadB){
        this.b = threadB;
    }

    @Override
    public void run(){
        try {
            synchronized (b){
                b.start();
                b.join();//释放锁
                for(int i=0;i<Integer.MAX_VALUE;i++){
                    String newString = new String();
                    Math.random();
                }
            };
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
