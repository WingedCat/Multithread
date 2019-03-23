package Thread4_1.Thread4_1_12.lockMethodTest3.test3;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            System.out.println(lock.isLocked());//isLocked()查询此锁是否由任意线程保持
            lock.lock();
            System.out.println(lock.isLocked());
        }finally {
            lock.unlock();
        }

    }
}
