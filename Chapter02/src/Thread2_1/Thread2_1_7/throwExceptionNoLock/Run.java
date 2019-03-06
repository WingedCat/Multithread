package Thread2_1.Thread2_1_7.throwExceptionNoLock;

public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA thread = new ThreadA(service);
            thread.setName("a");
            thread.start();
            Thread.sleep(500);
            ThreadB threadB = new ThreadB(service);
            threadB.setName("b");
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * ThreadName=a beginTime=1551596930596
         * ThreadName=a run exceptionTime=1551596930679
         * Exception in thread "a" java.lang.NumberFormatException: For input string: "a"
         * 	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
         * 	at java.lang.Integer.parseInt(Integer.java:580)
         * 	at java.lang.Integer.parseInt(Integer.java:615)
         * 	at Thread2_1.Thread2_1_7.throwExceptionNoLock.Service.testMethod(Service.java:11)
         * 	at Thread2_1.Thread2_1_7.throwExceptionNoLock.ThreadA.run(ThreadA.java:12)
         * Thread B run Time=1551596931098 → 线程A出现异常释放锁，线程B进入打印
         */
    }
}
