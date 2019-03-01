package Thread1_7.Thread1_7_1.t11;

/**
 * 停止不了的线程
 * 调用interrupt()方法来停止线程，但是此方法的使用效果并不像for+break语句那样，马上停止信号。
 * 调用interrupt()方法仅仅是在当前线程打了一个停止标记，并不会真的停止线程。
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 0;i < 5000;i++){
            System.out.println("i="+(i+1));
        }
    }
}
