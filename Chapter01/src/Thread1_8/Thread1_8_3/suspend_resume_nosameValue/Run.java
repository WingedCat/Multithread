package Thread1_8.Thread1_8_3.suspend_resume_nosameValue;

public class Run {
    public static void main(String[] args) {
        final MyObject myObject = new MyObject();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                myObject.setValue("a","aa");
            }
        };
        t1.setName("a");
        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new Thread(){
            @Override
            public void run(){
                myObject.printUsernamePassword();
            }
        };
        t2.start();
        /**
         * 暂停a线程
         * a  11
         */
    }
}
