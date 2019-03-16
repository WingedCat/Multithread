package Thread3_1.Thread3_1_11.p_c_allWait_fix;

public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C r = new C(lock);
        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] cThread = new ThreadC[2];
        for(int i=0;i<2;i++){
            pThread[i] = new ThreadP(p);
            pThread[i].setName("生产者"+(i+1));
            cThread[i] = new ThreadC(r);
            cThread[i].setName("消费者"+(i+1));
            pThread[i].start();
            cThread[i].start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for(int i=0;i<threadArray.length;i++){
            System.out.println(threadArray[i].getName()+"  "+threadArray[i].getState());
        }
    }
    /**
     * 为避免唤醒同类我们只需要将notify改为notifyAll即可
     */

}
