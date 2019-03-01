package Thread1_9.t17;

/**
 * yield()方法作用是放弃当前的CPU资源，将它让给其他的任务去占用CPU执行时间。但是，放弃时间不确定，有可能刚刚放弃马上又获得CPU时间片。
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for(int i = 0;i < 50000000;i++){
            Thread.yield();
            count = count + (i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时： "+(endTime - beginTime)+" 毫秒");
    }
}
