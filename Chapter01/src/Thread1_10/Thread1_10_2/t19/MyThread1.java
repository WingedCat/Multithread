package Thread1_10.Thread1_10_2.t19;

import java.util.Random;

public class MyThread1 extends Thread {
    @Override
    public void run(){
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for(int i=0;i<50000;i++){
            Random random = new Random();
            random.nextInt();
            addResult = addResult + 1;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("★★★★★★★☆☆☆☆☆☆☆thread 1 user time = "+(endTime-beginTime));
    }
}
