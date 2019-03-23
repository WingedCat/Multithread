package Thread4_1.Thread4_1_6.MustUseMoreCondition_OK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();

    public void awaitA(){
        try {
            lock.lock();
            System.out.println("begin awaitA的时间为："+System.currentTimeMillis()+" ThreadName="+Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end awaitA的时间为："+System.currentTimeMillis()+" ThreadName="+Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try {
            lock.lock();
            System.out.println("begin awaitB的时间为："+System.currentTimeMillis()+" ThreadName="+Thread.currentThread().getName());
            conditionB.await();
            System.out.println("end awaitB的时间为："+System.currentTimeMillis()+" ThreadName="+Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signAll_A(){
        try {
            lock.lock();
            System.out.println("signAll_A的时间为："+System.currentTimeMillis());
            conditionA.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public void signAll_B(){
        try {
            lock.lock();
            System.out.println("signAll_B的时间为："+System.currentTimeMillis());
            conditionB.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
