package Thread3_1.Thread3_1_5.waitInterruptException;

public class Test {
    public static void main(String[] args) {
        try{
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(5000);
            a.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * begin wait
         * java.lang.InterruptedException
         * 	at java.lang.Object.wait(Native Method)
         * 	at java.lang.Object.wait(Object.java:502)
         * 	at Thread3_1.Thread3_1_5.waitInterruptException.Service.testMethod(Service.java:8)
         * 	at Thread3_1.Thread3_1_5.waitInterruptException.ThreadA.run(ThreadA.java:13)
         * 出异常了，因为wait状态的线程被interrupt了~
         */
    }
}
