package Thread1_2.Thread1_2_2.ImplThreadUserRunnable;

public class Run2 {

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        Thread thread = new Thread(myThread1);//由于多态，所以我们可以传入一个Thread类的对象，将他的run方法交给其他线程进行调用
        thread.start();
        System.out.println("main运行结束~");
    }
}
