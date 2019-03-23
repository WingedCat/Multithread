package Thread4_1.Thread4_1_5.MustUseMoreCondition_Error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();

    public void awaitA(){
        try {
            lock.lock();
            System.out.println("begin awaitA的时间为："+System.currentTimeMillis()+" ThreadName="+Thread.currentThread().getName());
            condition.await();
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
            condition.await();
            System.out.println("end awaitB的时间为："+System.currentTimeMillis()+" ThreadName="+Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signAll(){
        try {
            lock.lock();
            System.out.println("signAll的时间为："+System.currentTimeMillis());
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
