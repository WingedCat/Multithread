package Thread2_3.Thread2_3_6.atomicIntegerNoSafe;

public class Run {
    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            MyThread[] array = new MyThread[5];
            for(int i=0;i<5;i++){
                array[i] = new MyThread(service);
            }
            for(int i=0;i<5;i++){
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(MyService.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * 最终的结果是正确的，但是打印的顺序错误了，应该是加一次100后再加一次1，addAndGet()方法是原子的，但是两个方法直接的调用却不是原子的。
         * Thread-1 加了100之后的值是：200
         * Thread-2 加了100之后的值是：100
         * Thread-4 加了100之后的值是：500
         * Thread-3 加了100之后的值是：400
         * Thread-0 加了100之后的值是：300
         * 505
         */

        /**
         * 给addNum()方法加上synchronized：
         * Thread-0 加了100之后的值是：100
         * Thread-4 加了100之后的值是：201
         * Thread-2 加了100之后的值是：302
         * Thread-3 加了100之后的值是：403
         * Thread-1 加了100之后的值是：504
         * 505
         */
    }
}
