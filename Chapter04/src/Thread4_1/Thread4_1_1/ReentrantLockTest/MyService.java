package Thread4_1.Thread4_1_1.ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();

    public void testMethod(){
        lock.lock();//加锁
        for(int i=0;i<5;i++){
            System.out.println("ThreadName="+Thread.currentThread().getName()+("  "+(i+1)));
        }
        lock.unlock();//解锁
    }
}
