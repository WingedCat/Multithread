package Thread3_3.Thread3_3_2.s5;

import java.util.Date;

public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for(int i=0;i<20;i++) {
                if (Tools.threadLocal.get() == null) {//第一次取值时为null
                    Tools.threadLocal.set(new Date());
                }
                System.out.println("Main get value=" + Tools.threadLocal.get().getTime());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
