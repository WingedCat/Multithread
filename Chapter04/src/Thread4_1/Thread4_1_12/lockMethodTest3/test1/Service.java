package Thread4_1.Thread4_1_12.lockMethodTest3.test1;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock = new ReentrantLock();
    public Service(boolean isFair){
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("公平锁情况："+lock.isFair());
        }finally {
            lock.unlock();
        }
    }
}
