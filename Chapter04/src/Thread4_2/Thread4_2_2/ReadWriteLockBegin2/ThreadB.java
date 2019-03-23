package Thread4_2.Thread4_2_2.ReadWriteLockBegin2;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run(){
        service.write();
    }
}
