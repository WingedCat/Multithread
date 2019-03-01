package Thread1_2.Thread1_2_1.ExtendThread;

/**
 * 集成Thread类实现自己的线程
 */
public class MyThread extends Thread {

    @Override
    public void run(){
        super.run();
        System.out.println("MyThread");
    }
}
