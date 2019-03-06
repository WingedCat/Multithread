package Thread2_3.Thread2_3_5.AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run(){
        for(int i=0;i<10000;i++){
            System.out.println(count.incrementAndGet());
        }
    }
}
