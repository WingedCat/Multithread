package Thread1_7.Thread1_7_7.stopThrowLock;

public class Run {
    public static void main(String[] args) {
        SynchronizedObject object = new SynchronizedObject();
        MyThread thread = new MyThread(object);
        thread.start();
        try {
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername() + "   " +object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
