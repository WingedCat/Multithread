package Thread2_2.Thread2_2_1.t5;

public class MyThread2 extends Thread{
    private Task task;

    public MyThread2(Task task){
        this.task = task;
    }

    @Override
    public void run(){
        CommUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommUtils.endTime2 = System.currentTimeMillis();
    }
}
