package Thread1_7.Thread1_7_2.t12;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println("是否停止1？ = " + myThread.interrupted());
            System.out.println("是否停止2？ = " + myThread.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
        /**
         * i=5000
         * 是否停止1？ = false
         * 是否停止2？ = false
         * end
         * this.interrupted():测试当前线程是否已经中断。当前线程是main，当然没有停止
         */
    }
}
