package Thread3_1.Thread3_1_4.notifyHoldLock;

public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        synNotifyMethodThread c = new synNotifyMethodThread(lock);
        c.start();
    }
    /**
     * begin wait() ThreadName=Thread-0
     * begin notify() ThreadName=Thread-1 time=1552306763925
     * end notify() ThreadName=Thread-1 time=1552306768925
     * end wait() ThreadName=Thread-0 → notify结束后退出同步块或方法才会释放锁
     * begin notify() ThreadName=Thread-2 time=1552306768925
     * end notify() ThreadName=Thread-2 time=1552306773925
     */
}
