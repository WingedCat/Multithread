package Thread1_8.Thread1_8_2.suspend_resume_LockStop;

public class Run2 {
    public static void main(String[] args) {
        MyThread2 thread = new MyThread2();
        thread.start();
        try {
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * ……
     * 180543
     * 180544
     * 180545
     * 这时候不会再打印main end，因为println()方法内部是同步的，当运行到println方法内部停止时，同步锁未释放。所以main end无法打印
     */
}
