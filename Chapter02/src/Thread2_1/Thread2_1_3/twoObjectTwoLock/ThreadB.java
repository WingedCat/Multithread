package Thread2_1.Thread2_1_3.twoObjectTwoLock;

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
