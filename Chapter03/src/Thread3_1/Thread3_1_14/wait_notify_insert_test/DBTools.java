package Thread3_1.Thread3_1_14.wait_notify_insert_test;

public class DBTools {
    volatile private boolean preIsA = false;

    synchronized public void backupA(){
        try{
            while (preIsA){
                wait();
            }
            System.out.println("★★★★★");
            preIsA = true;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void backupB(){
        try{
            while (!preIsA){
                wait();
            }
            System.out.println("☆☆☆☆☆");
            preIsA = false;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
