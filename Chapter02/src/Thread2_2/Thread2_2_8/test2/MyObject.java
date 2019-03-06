package Thread2_2.Thread2_2_8.test2;

public class MyObject {
    synchronized public void speedPrintString(){
        System.out.println("speedPrintString _getLock time="+System.currentTimeMillis()+"  run ThreadName="+Thread.currentThread().getName());
        System.out.println("--------------------------");
        System.out.println("speedPrintString _releaseLock time="+System.currentTimeMillis()+"  run ThreadName="+Thread.currentThread().getName());
    }
}
