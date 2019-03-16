package Thread3_1.Thread3_1_10.waitOld;

public class ThreadSubtract extends Thread {
    private Subtract r;

    public ThreadSubtract(Subtract r){
        this.r = r;
    }

    @Override
    public void run(){
        r.subtract();
    }
}
