package Thread4_2.Thread4_2_2.ReadWriteLockBegin2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write(){
        try {
            try {
                lock.writeLock().lock();
                System.out.println("获得写锁"+Thread.currentThread().getName()+"  "+System.currentTimeMillis());
                Thread.sleep(10000);
            }finally {
                lock.writeLock().unlock();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
