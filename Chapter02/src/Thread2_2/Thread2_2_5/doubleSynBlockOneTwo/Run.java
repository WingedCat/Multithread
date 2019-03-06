package Thread2_2.Thread2_2_5.doubleSynBlockOneTwo;

public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        /**
         * 两个同步代码块按顺序执行：
         * A begin Time=1551601971488
         * A end time=1551601973488
         * B begin Time=1551601973488
         * B end time=1551601973488
         */
    }
}
