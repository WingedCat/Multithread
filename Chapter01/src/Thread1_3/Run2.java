package Thread1_3;

public class Run2 {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t = new Thread(c);
        t.setName("A");
        t.start();
        c.start();
        /**
         * CountOperate---begin
         * Thread.currentThread().getName() = main
         * this.getName() = Thread-0
         * CountOperate---end
         * run---begin
         * Thread.currentThread().getName() = A
         * this.getName() = Thread-0
         * run---end
         */
    }
}
