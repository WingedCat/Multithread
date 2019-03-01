package Thread1_7.Thread1_7_2.t12;

public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println("是否停止1？ = " + myThread.isInterrupted());
            System.out.println("是否停止2？ = " + myThread.isInterrupted());
            /**
             * 是否停止1？ = true
             * i=143930
             * i=143931
             * i=143932
             * i=143933
             * i=143934
             * i=143935
             * i=143936
             * i=143937
             * i=143938
             * i=143939
             * i=143940
             * i=143941
             * i=143942
             * i=143943
             * 是否停止2？ = true
             * end
             * isInterrupted()方法不会影响中断标志。
             */
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
