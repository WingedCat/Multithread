package Thread2_1.Thread2_1_3.twoObjectTwoLock;

public class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef){
        this.numRef = numRef;
    }

    @Override
    public void run(){
        numRef.addI("a");
    }
}
