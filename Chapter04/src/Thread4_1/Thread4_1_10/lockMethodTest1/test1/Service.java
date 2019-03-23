package Thread4_1.Thread4_1_10.lockMethodTest1.test1;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1(){
        try {
            lock.lock();
            //getHoldCount()方法查询当前线程保持此锁定的个数，也就是调用lock()方法的次数。
            System.out.println("serviceMethod1 getHoldCount="+lock.getHoldCount());
            serviceMethod2();
        }finally {
            lock.unlock();
        }
    }

    public void serviceMethod2(){
        try {
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount="+lock.getHoldCount());
        }finally {
            lock.unlock();
        }
    }
}
