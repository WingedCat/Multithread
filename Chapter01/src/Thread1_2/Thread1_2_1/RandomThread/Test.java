package Thread1_2.Thread1_2_1.RandomThread;

public class Test {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            //myThread.start();
            myThread.run();
            for(int i = 0;i < 10;i++){
                int time = (int)(Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main = "+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * 两个线程异步执行
         * run = myThread
         * run = myThread
         * main = main
         * main = main
         * main = main
         * run = myThread
         * main = main
         * run = myThread
         * run = myThread
         * main = main
         * run = myThread
         * main = main
         * run = myThread
         * main = main
         * main = main
         * run = myThread
         * main = main
         * main = main
         * run = myThread
         * run = myThread
         */

        /**
         * myThread调用run方法时并不是启动线程，而是由main调用run方法，这是同步执行的。
         * run = main
         * run = main
         * run = main
         * run = main
         * run = main
         * run = main
         * run = main
         * run = main
         * run = main
         * run = main
         * main = main
         * main = main
         * main = main
         * main = main
         * main = main
         * main = main
         * main = main
         * main = main
         * main = main
         * main = main
         */
    }
}
