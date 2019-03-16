package Thread3_2.Thread3_2_3.joinException;

public class Run {
    public static void main(String[] args) {
        try{
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    /**在join过程中被中断了，抛出异常了
     * 线程B在catch中打印了
     * java.lang.InterruptedException
     * 	at java.lang.Object.wait(Native Method)
     * 	at java.lang.Thread.join(Thread.java:1252)
     * 	at java.lang.Thread.join(Thread.java:1326)
     * 	at Thread3_2.Thread3_2_3.joinException.ThreadB.run(ThreadB.java:9)
     */
}
