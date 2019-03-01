package Thread1_7.Thread1_7_2.t12;

/**
 * 判断线程是否是停止状态
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 0;i < 500000;i++){
            System.out.println("i="+(i+1));
        }
    }
}
