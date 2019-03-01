package Thread1_11.daemonThread;

public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setDaemon(true);
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是非守护进程，我停止后守护线程也就销毁了！");
        /**
         * i=1
         * i=2
         * i=3
         * i=4
         * i=5
         * 我是非守护进程，我停止后守护线程也就销毁了！
         */

    }
}
