package Thread2_2.Thread2_2_3.t6;

public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommUtils.beginTime1 > CommUtils.beginTime2 ? CommUtils.beginTime2 : CommUtils.beginTime1;
        long endTime = CommUtils.endTime1 > CommUtils.endTime2 ? CommUtils.endTime1 : CommUtils.endTime2;
        System.out.println("总耗时："+(endTime - beginTime)/1000);
        /**
         * begin task
         * begin task
         * 长时间处理任务后从远程返回的值1 threadName=Thread-0
         * 长时间处理任务后从远程返回的值2 threadName=Thread-1
         * 长时间处理任务后从远程返回的值1 threadName=Thread-1
         * 长时间处理任务后从远程返回的值2 threadName=Thread-1
         * end task
         * end task
         * 总耗时：3
         * 使用synchronized代码块后速度是更快了，但是不安全了。
         */
    }
}
