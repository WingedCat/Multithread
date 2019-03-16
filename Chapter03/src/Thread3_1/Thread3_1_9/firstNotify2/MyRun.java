package Thread3_1.Thread3_1_9.firstNotify2;

public class MyRun {
    private String lock = new String("");
    private boolean hasNotify = false;
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try{
                synchronized (lock){
                    while(hasNotify == false){
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    };

    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                hasNotify = true;
            }
        }
    };

    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread a = new Thread(run.runnableA);
        a.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread b = new Thread(run.runnableB);
        b.start();
        /**
         * begin wait
         * begin notify
         * end notify
         * end wait
         */


//        Thread b = new Thread(run.runnableB);
//        b.start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Thread a = new Thread(run.runnableA);
//        a.start();
        /**
         * begin notify
         * end notify
         * 通知过早了，也就不执行wait了
         */
    }
}
