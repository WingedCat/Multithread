package Thread1_7.Thread1_7_8.useReturnInterrupt;

public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            Thread.sleep(2000);
            t.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * timer = 1551430384959
         * timer = 1551430384959
         * timer = 1551430384959
         * timer = 1551430384959
         * timer = 1551430384959
         * 停止了~
         */
    }
}
