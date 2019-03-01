package Thread1_7.Thread1_7_7.stopThrowLock;

public class MyThread extends Thread {
    private SynchronizedObject object;

    public MyThread(SynchronizedObject object){
        this.object = object;
    }

    @Override
    public void run(){
        object.printString("b","bb");
    }
}
