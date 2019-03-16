package Thread3_4.Thread3_4_1.InheritableThreadLocal1;

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
         * 子线程可以继承父线程中的值。
         * 在Main线程中取值=1552742779889
         * 在Main线程中取值=1552742779889
         * 在Main线程中取值=1552742779889
         * 在Main线程中取值=1552742779889
         * 在Main线程中取值=1552742779889
         * 在Main线程中取值=1552742779889
         * 在Main线程中取值=1552742779889
         * 在Main线程中取值=1552742779889
         * 在Main线程中取值=1552742779889
         * 在Main线程中取值=1552742779889
         * 在ThreadA线程中取值=1552742779889
         * 在ThreadA线程中取值=1552742779889
         * 在ThreadA线程中取值=1552742779889
         * 在ThreadA线程中取值=1552742779889
         * 在ThreadA线程中取值=1552742779889
         * 在ThreadA线程中取值=1552742779889
         * 在ThreadA线程中取值=1552742779889
         * 在ThreadA线程中取值=1552742779889
         * 在ThreadA线程中取值=1552742779889
         * 在ThreadA线程中取值=1552742779889
         */
    }
}
