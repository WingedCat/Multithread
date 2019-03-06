package Thread2_2.Thread2_2_6.t8;

public class MyThread1 extends Thread {
    private Task task;

    public MyThread1(Task task){
        this.task = task;
    }

    @Override
    public void run(){
        task.doLongTimeTask();
    }
}
