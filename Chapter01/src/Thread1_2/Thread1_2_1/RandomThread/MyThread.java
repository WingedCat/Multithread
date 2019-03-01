package Thread1_2.Thread1_2_1.RandomThread;

/**
 * 此代码旨在说明线程的调度是随机进行的
 */
public class MyThread extends Thread{

    @Override
    public void run(){
        try {
            for(int i=0;i<10;i++){
                int time =(int)( Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run = "+ Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
