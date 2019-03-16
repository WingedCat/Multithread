package Thread3_3.Thread3_3_2.ThreadLocalTest;

public class ThreadB extends Thread {
    @Override
    public void run(){
        try {
            for(int i=0;i<100;i++){
                Tools.threadLocal.set("ThreadB"+(i+1));
                System.out.println("ThreadB get value="+Tools.threadLocal.get());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
