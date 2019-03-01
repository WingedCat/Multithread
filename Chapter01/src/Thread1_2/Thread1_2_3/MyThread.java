package Thread1_2.Thread1_2_3;

/**
 * 实例变量与线程安全
 * 不共享数据的情况，没有线程安全问题
 */
public class MyThread extends Thread{
    private int count = 5;

    public MyThread(String name){
        this.setName(name);
    }

    @Override
    public void run(){
        while(count > 0){
            count--;
            System.out.println("由" + Thread.currentThread().getName() + "计算，count = " + count);
        }
    }

}
