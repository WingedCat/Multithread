package Thread4_1.Thread4_1_13.lockInterruptiblyTest1;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyService service = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();
        System.out.println("main end");

        /**使用lock()方法，即使线程中断了也不会抛异常
         lock begin A
         main end
         lock end A
         lock begin B
         lock end B
         */
    }
}
