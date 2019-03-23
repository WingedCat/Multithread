package Thread4_1.Thread4_1_13.tryLockTest;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod(){
        if(lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+"获得锁");
        }else {
            System.out.println(Thread.currentThread().getName()+"没有获得锁");
        }
    }
}
