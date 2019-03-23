package Thread4_1.Thread4_1_3.z3_ok;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        /**
         * A
         * 只打印了A，因为condit调用了await()方法后线程处于WAITINT状态
         */
    }
}
