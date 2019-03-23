package Thread4_2.Thread4_2_2.ReadWriteLockBegin2;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run(){
        service.write();
    }
}
