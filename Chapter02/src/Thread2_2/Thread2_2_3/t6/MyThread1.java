package Thread2_2.Thread2_2_3.t6;

public class MyThread1 extends Thread{
    private Task task;

    public MyThread1(Task task){
        this.task = task;
    }

    @Override
    public void run(){
        CommUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommUtils.endTime1 = System.currentTimeMillis();
    }
}
