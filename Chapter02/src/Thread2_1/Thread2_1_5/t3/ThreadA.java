package Thread2_1.Thread2_1_5.t3;

public class ThreadA extends Thread {
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar){
        this.publicVar = publicVar;
    }
    @Override
    public void run(){
        publicVar.setValue("B","BB");
    }
}
