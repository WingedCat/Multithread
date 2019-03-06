package Thread2_1.Thread2_1_4.synchronizedMethodLockObject;

public class MyObject {
    synchronized public void methodA(){
        try {
            System.out.println("begin methodA threadName = "+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end methodA threadName = "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
