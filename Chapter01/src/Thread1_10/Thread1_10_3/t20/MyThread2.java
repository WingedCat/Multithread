package Thread1_10.Thread1_10_3.t20;

import java.util.Random;

public class MyThread2 extends Thread {
    @Override
    public void run(){
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for(int i=0;i<1000;i++){
            Random random = new Random();
            random.nextInt();
            addResult = addResult + 1;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("☆☆☆☆☆☆☆thread 2 user time = "+(endTime-beginTime));
    }
}
