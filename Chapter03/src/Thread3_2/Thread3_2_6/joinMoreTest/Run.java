package Thread3_2.Thread3_2_6.joinMoreTest;

public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("  main end "+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        /**
         * 产生意外结果：
         * begin A ThreadName=Thread-1   1552738664887
         *  end A ThreadName=Thread-1   1552738669887
         *   main end 1552738669887  → join()方法后的代码提前执行了。
         * begin B ThreadName=Thread-0   1552738669887
         *   end B ThreadName=Thread-0   1552738674887
         */
    }
}
