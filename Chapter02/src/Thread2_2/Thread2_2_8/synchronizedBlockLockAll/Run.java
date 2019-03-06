package Thread2_2.Thread2_2_8.synchronizedBlockLockAll;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service,object);
        b.setName("B");
        b.start();
        /**
         * testMethod1 _getLock time=1551606863149  run ThreadName=A
         * testMethod1 _releaseLock time=1551606863350  run ThreadName=A
         * testMethod1 _getLock time=1551606863350  run ThreadName=B
         * testMethod1 _releaseLock time=1551606863551  run ThreadName=B
         */
    }
}
