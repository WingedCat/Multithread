package Thread4_1.Thread4_1_13.lockInterruptiblyTest2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        try {
            lock.lockInterruptibly();
            System.out.println("lock begin "+Thread.currentThread().getName());
            for(int i=0;i<Integer.MAX_VALUE/10;i++){
                String newString = new String();
                Math.random();
            }
            System.out.println("lock end "+Thread.currentThread().getName());
        }catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName()+ " 被中断了");
            e.printStackTrace();
        }finally {
            if(lock.isHeldByCurrentThread()){
                System.out.println(Thread.currentThread().getName()+" 释放锁");
                lock.unlock();
            }
        }
    }
}
