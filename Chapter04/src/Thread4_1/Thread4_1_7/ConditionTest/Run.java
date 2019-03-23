package Thread4_1.Thread4_1_7.ConditionTest;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.start();
        MyThreadB b = new MyThreadB(service);
        b.start();
        /**
         * 打印★
         * 打印☆
         * 打印★
         * 打印☆
         * 打印★
         * 打印☆
         * 打印★
         */
    }
}
