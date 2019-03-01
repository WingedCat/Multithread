package Thread1_7.Thread1_7_4.t14;

public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("run begin");
        try {
            Thread.sleep(20000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止，进入catch~ "+this.isInterrupted());
            e.printStackTrace();
        }

    }
}
