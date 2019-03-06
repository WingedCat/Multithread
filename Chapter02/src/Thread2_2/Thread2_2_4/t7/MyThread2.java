package Thread2_2.Thread2_2_4.t7;


public class MyThread2 extends Thread{
    private Task task;

    public MyThread2(Task task){
        this.task = task;
    }

    @Override
    public void run(){
        task.doLongTimeTask();
    }
}
