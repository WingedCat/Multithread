package Thread2_2.Thread2_2_7.t9;

public class MyThread2 extends Thread {
    private MyOneList list;

    public MyThread2(MyOneList list){
        this.list = list;
    }

    @Override
    public void run(){
        MyService msRef = new MyService();
        msRef.addServiceMethod(list,"B");
    }
}
