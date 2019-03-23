package Thread4_1.Thread4_1_12.lockMethodTest3.test2;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try {
            System.out.println(lock.isHeldByCurrentThread());//isHeldByCurrentThread()查看当前线程是否保存此锁的锁定
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        }finally {
            lock.unlock();
        }
    }
}
