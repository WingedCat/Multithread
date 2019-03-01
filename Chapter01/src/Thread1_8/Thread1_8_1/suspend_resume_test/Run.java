package Thread1_8.Thread1_8_1.suspend_resume_test;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(5000);
            //A段
            thread.suspend();
            System.out.println("A = "+ System.currentTimeMillis() + " i="+thread.getI());
            Thread.sleep(5000);
            System.out.println("A = "+ System.currentTimeMillis() + " i="+thread.getI());
            Thread.sleep(5000);

            //B段
            thread.resume();
            Thread.sleep(5000);

            //C段
            thread.suspend();
            System.out.println("B = "+ System.currentTimeMillis() + " i="+thread.getI());
            Thread.sleep(5000);

            System.out.println("B = "+ System.currentTimeMillis() + " i="+thread.getI());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * A = 1551431162188 i=3656888595
         * A = 1551431167189 i=3656888595
         * B = 1551431177190 i=7332719309
         * B = 1551431182190 i=7332719309
         */
    }
}
