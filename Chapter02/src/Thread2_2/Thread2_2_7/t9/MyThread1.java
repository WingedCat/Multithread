package Thread2_2.Thread2_2_7.t9;

public class MyThread1 extends Thread {
    private MyOneList list;

    public MyThread1(MyOneList list){
        this.list = list;
    }

    @Override
    public void run(){
        MyService msRef = new MyService();
        msRef.addServiceMethod(list,"A");
    }
}
