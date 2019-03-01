package Thread1_7.Thread1_7_4.t15;


public class MyThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("i = "+(i+1));
        }
        System.out.println("run begin");
        try {
            Thread.sleep(20000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到sleep，进入catch~ "+this.isInterrupted());
            e.printStackTrace();
        }

    }
}
