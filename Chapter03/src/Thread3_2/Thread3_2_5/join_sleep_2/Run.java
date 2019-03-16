package Thread3_2.Thread3_2_5.join_sleep_2;

public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * b run begin time=1552738116272
         * 打印了 bService time=1552738117272
         * b run end time=1552738121272
         */
    }
}
