package Thread3_3.Thread3_3_2.s5;

import java.util.Date;

public class ThreadB extends Thread {
    @Override
    public void run(){
        try {
            for(int i=0;i<20;i++) {
                if (Tools.threadLocal.get() == null) {
                    Tools.threadLocal.set(new Date());
                }
                System.out.println("ThreadB get value=" + Tools.threadLocal.get().getTime());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
