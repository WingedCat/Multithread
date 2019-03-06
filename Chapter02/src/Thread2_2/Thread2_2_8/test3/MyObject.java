package Thread2_2.Thread2_2_8.test3;

public class MyObject {
    public void speedPrintString(){
        synchronized (this){
            System.out.println("speedPrintString _getLock time="+System.currentTimeMillis()+"  run ThreadName="+Thread.currentThread().getName());
            System.out.println("--------------------------");
            System.out.println("speedPrintString _releaseLock time="+System.currentTimeMillis()+"  run ThreadName="+Thread.currentThread().getName());
        }
    }
}
