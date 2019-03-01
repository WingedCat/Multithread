package Thread1_8.Thread1_8_2.suspend_resume_LockStop;

public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
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
     * main end
     * ……一直暂停
     */
}
