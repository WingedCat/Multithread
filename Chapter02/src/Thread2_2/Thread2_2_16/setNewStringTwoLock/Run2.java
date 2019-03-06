package Thread2_2.Thread2_2_16.setNewStringTwoLock;

public class Run2 {
    public static void main(String[] args) {
        User user = new User();
        Service service = new Service();
        ThreadA2 a = new ThreadA2(service,user);
        a.setName("A");
        ThreadB2 b = new ThreadB2(service,user);
        b.setName("B");
        a.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();
        /**
         * 只要对象不变（即user）,即使对象的属性被改变，运行结果还是同步的。
         * A
         * end time = 1551793218764
         * B
         * end time = 1551793221764
         */
    }
}
