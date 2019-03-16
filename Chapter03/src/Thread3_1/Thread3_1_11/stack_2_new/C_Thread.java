package Thread3_1.Thread3_1_11.stack_2_new;

public class C_Thread extends Thread {
    private C r;

    public C_Thread(C r){
        this.r = r;
    }

    @Override
    public void run(){
        while(true){
            r.popService();
        }
    }
}
