package Thread2_2.Thread2_2_7.t9;

public class Run {
    public static void main(String[] args) {
        MyOneList list = new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        thread1.setName("A");
        thread1.start();
        MyThread2 thread2 = new MyThread2(list);
        thread2.setName("B");
        thread2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("listSize = "+list.getSize());
        /**
         * 无序性带来的错误：
         * listSize = 2
         */

        /**
         * 使用list为锁对象
         * listSize = 1
         */
    }
}
