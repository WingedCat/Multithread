package Thread1_8.Thread1_8_2.suspend_resume_deal_lock;

public class SynchronizedObject {
    synchronized public void printString(){
        System.out.println("begin");
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远 suspend 了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
