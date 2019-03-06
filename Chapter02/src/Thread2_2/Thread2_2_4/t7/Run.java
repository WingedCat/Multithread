package Thread2_2.Thread2_2_4.t7;

public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        MyThread2 thread2 = new MyThread2(task);
        thread1.start();
        thread2.start();
    }
}
