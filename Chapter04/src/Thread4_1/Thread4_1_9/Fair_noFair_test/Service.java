package Thread4_1.Thread4_1_9.Fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()+"获得锁定");
        }finally {
            lock.unlock();
        }
    }
}
