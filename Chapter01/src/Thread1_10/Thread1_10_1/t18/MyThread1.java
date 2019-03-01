package Thread1_10.Thread1_10_1.t18;

public class MyThread1 extends Thread {
    @Override
    public void run(){
        System.out.println("MyThread1 run priority = " + this.getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();//线程优先级具有继承性，如果如果在线程中启动其他线程，那么被启动的线程和当前线程优先级是相同的。
    }
}
