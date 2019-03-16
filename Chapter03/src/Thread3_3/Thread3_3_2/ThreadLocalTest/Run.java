package Thread3_3.Thread3_3_2.ThreadLocalTest;

public class Run {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for(int i=0;i<100;i++){
                Tools.threadLocal.set("Main"+(i+1));
                System.out.println("Main get Value="+Tools.threadLocal.get());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
