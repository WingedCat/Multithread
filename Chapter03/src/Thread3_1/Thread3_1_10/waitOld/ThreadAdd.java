package Thread3_1.Thread3_1_10.waitOld;

public class ThreadAdd  extends  Thread{
    private Add p;

    public ThreadAdd(Add p){
        this.p = p;
    }

    @Override
    public void run(){
        p.add();
    }
}
