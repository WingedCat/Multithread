package Thread3_4.Thread3_4_2.InheritableThreadLocal2;

public class Run {
    public static void main(String[] args) {
        try {
            for(int i=0;i<10;i++){
                System.out.println("在Main线程中取值="+ Tools.threadLocalExt.get());
                Thread.sleep(200);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * 子线程可以继承父线程中的值,同时可以对它进行修改。
         * 如果子线程在取值时恰好父线程对值进行了修改，子线程取得的还是旧值。
         * 在Main线程中取值=1552742962164
         * 在Main线程中取值=1552742962164
         * 在Main线程中取值=1552742962164
         * 在Main线程中取值=1552742962164
         * 在Main线程中取值=1552742962164
         * 在Main线程中取值=1552742962164
         * 在Main线程中取值=1552742962164
         * 在Main线程中取值=1552742962164
         * 在Main线程中取值=1552742962164
         * 在Main线程中取值=1552742962164
         * 在ThreadA线程中取值=1552742962164  我在子线程中加的~
         * 在ThreadA线程中取值=1552742962164  我在子线程中加的~
         * 在ThreadA线程中取值=1552742962164  我在子线程中加的~
         * 在ThreadA线程中取值=1552742962164  我在子线程中加的~
         * 在ThreadA线程中取值=1552742962164  我在子线程中加的~
         * 在ThreadA线程中取值=1552742962164  我在子线程中加的~
         * 在ThreadA线程中取值=1552742962164  我在子线程中加的~
         * 在ThreadA线程中取值=1552742962164  我在子线程中加的~
         * 在ThreadA线程中取值=1552742962164  我在子线程中加的~
         * 在ThreadA线程中取值=1552742962164  我在子线程中加的~
         */
    }
}
