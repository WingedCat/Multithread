package Thread3_4.Thread3_4_2.InheritableThreadLocal2;

public class ThreadA extends Thread {
    @Override
    public void run(){
        try {
            for(int i=0;i<10;i++){
                System.out.println("在ThreadA线程中取值="+ Tools.threadLocalExt.get());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
