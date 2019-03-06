package Thread2_2.Thread2_2_8.test2;


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
         * 其他线程执行对象监视器中的同步方法呈同步效果
         * testMethod1 _getLock time=1551607380167  run ThreadName=A
         * testMethod1 _releaseLock time=1551607385167  run ThreadName=A
         * speedPrintString _getLock time=1551607385167  run ThreadName=B
         * --------------------------
         * speedPrintString _releaseLock time=1551607385167  run ThreadName=B
         */
    }
}
