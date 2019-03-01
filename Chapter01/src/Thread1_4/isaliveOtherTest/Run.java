package Thread1_4.isaliveOtherTest;

public class Run {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t = new Thread(c);
        System.out.println("main begin t isAlive() = " + t.isAlive());
        t.setName("A");
        t.start();
        System.out.println("main end t isAlive() = "+t.isAlive());
        /**
         * CountOperate---begin
         * Thread.currentThread().getName() = main
         * this.getName() = Thread-0
         * this.isAlive() = false
         * CountOperate---end
         * main begin t isAlive() = false
         * main end t isAlive() = true
         * run---begin
         * Thread.currentThread().getName() = A
         * this.getName() = Thread-0
         * this.isAlive() = false  → 启动的是线程A,由它调用实例c的run方法，c是没有启动的
         * run---end
         */
    }
}
