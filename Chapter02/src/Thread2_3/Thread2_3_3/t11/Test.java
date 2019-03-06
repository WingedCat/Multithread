package Thread2_3.Thread2_3_3.t11;

public class Test {
    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经被设置为false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * 进入run了
         * 已经被设置为false
         * 私有堆栈和公共堆栈中的值不同造成的。
         * 解决思路：
         * 使用volatile关键字，它的主要作用是强制从公共堆栈中取值。
         * 进入run了
         * 已经被设置为false
         * run 停止了
         */
    }
}
