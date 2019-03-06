package Thread2_2.Thread2_2_8.synchronizedBlockLockAll;

public class Run2 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        MyObject object2 = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service,object2);
        b.setName("B");
        b.start();
        /**
         * 不同的对象监视器：
         * testMethod1 _getLock time=1551607067572  run ThreadName=A
         * testMethod1 _getLock time=1551607067573  run ThreadName=B
         * testMethod1 _releaseLock time=1551607067773  run ThreadName=B
         * testMethod1 _releaseLock time=1551607067773  run ThreadName=A
         */
    }
}
