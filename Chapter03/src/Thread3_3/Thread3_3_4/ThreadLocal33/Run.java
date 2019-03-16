package Thread3_3.Thread3_3_4.ThreadLocal33;

public class Run {
    public static void main(String[] args) {
        try {
            for(int i=0;i<10;i++){
                System.out.println("在Main线程中取值="+Tools.threadLocalExt.get());
                Thread.sleep(200);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * 子线程和父线程各有各自的值。
         * 在Main线程中取值=1552742461243
         * 在Main线程中取值=1552742461243
         * 在Main线程中取值=1552742461243
         * 在Main线程中取值=1552742461243
         * 在Main线程中取值=1552742461243
         * 在Main线程中取值=1552742461243
         * 在Main线程中取值=1552742461243
         * 在Main线程中取值=1552742461243
         * 在Main线程中取值=1552742461243
         * 在Main线程中取值=1552742461243
         * 在ThreadA线程中取值=1552742468252
         * 在ThreadA线程中取值=1552742468252
         * 在ThreadA线程中取值=1552742468252
         * 在ThreadA线程中取值=1552742468252
         * 在ThreadA线程中取值=1552742468252
         * 在ThreadA线程中取值=1552742468252
         * 在ThreadA线程中取值=1552742468252
         * 在ThreadA线程中取值=1552742468252
         * 在ThreadA线程中取值=1552742468252
         * 在ThreadA线程中取值=1552742468252
         */
    }
}
