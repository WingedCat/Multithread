package Thread1_9.t17;

public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        /**
         * 没有使用yield时：
         * 用时： 16 毫秒
         *
         * 使用yield后：
         * 用时： 24218 毫秒
         */
    }
}
