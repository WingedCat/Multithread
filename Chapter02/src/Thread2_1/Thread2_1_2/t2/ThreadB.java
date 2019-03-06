package Thread2_1.Thread2_1_2.t2;

public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef){
        this.numRef = numRef;
    }

    @Override
    public void run(){
        numRef.addI("b");
    }
}
