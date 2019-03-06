package Thread2_1.Thread2_1_6.synLockIn_2;

public class Main {
    public int i = 10;

    synchronized public void operateIMainMethod(){
        try {
            i--;
            System.out.println("main print i="+i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
