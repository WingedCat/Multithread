package Thread1_8.Thread1_8_2.suspend_resume_deal_lock;

public class Run {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread t1 = new Thread(){
                @Override
                public void run(){
                    object.printString();
                }
            };
            t1.setName("a");
            t1.start();

                Thread.sleep(1000);

            Thread t2 = new Thread(){
                @Override
                public void run(){
                    System.out.println("t2 无法进入printString方法，它被a线程独占了");
                    object.printString();
                }
            };
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * begin
     * a线程永远 suspend 了
     * t2 无法进入printString方法，它被a线程独占了
     */
}
