package Thread3_1.Thread3_1_8.waitHasParamMethod;

public class MyRunnable {
    static private Object lock = new Object();
    static private Runnable runnable1 = new Runnable(){
        @Override
        public void run(){
            try{
                synchronized (lock){
                    System.out.println("wait begin timer="+System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait end timer="+System.currentTimeMillis());
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    };

    static private Runnable runnable2 = new Runnable(){
        @Override
        public void run(){
            synchronized (lock){
                System.out.println("notify begin timer="+System.currentTimeMillis());
                lock.notify();
                System.out.println("notify end timer="+System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) {
        Thread t = new Thread(runnable1);
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new Thread(runnable2);
        t2.start();
        /**
         * wait begin timer=1552353966633
         * wait end timer=1552353971633
         * 5s后自动唤醒了，也可以在5s内被其他线程唤醒。
         */

        /**
         * wait begin timer=1552354084262
         * notify begin timer=1552354086263
         * notify end timer=1552354086263
         * wait end timer=1552354086263
         */
    }
}
