package Thread1_10.Thread1_10_1.t18;

public class MyThread2 extends Thread {
    @Override
    public void run(){
        System.out.println("MyThread2 run priority = " + this.getPriority());
    }
}
