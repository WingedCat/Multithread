package Thread2_3.Thread2_3_4.volatileTestThread;

public class MyThread extends Thread {
    public static int count;

    /**
     * 加上synchronized后做到同步，使用同步后count也不需要volatile关键字修饰了。
     */
    synchronized private static void addCount(){
        for(int i=0;i<100;i++){
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run(){
       addCount();
    }
}
