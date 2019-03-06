package Thread2_2.Thread2_2_8.test2;


public class Service {
    public void testMethod1(MyObject object){
        synchronized (object){
            try {
                System.out.println("testMethod1 _getLock time="+System.currentTimeMillis()+"  run ThreadName="+ Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod1 _releaseLock time="+System.currentTimeMillis()+"  run ThreadName="+ Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
