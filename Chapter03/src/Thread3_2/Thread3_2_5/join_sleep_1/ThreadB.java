package Thread3_2.Thread3_2_5.join_sleep_1;

public class ThreadB extends Thread {

    @Override
    public void run(){
        try {
            System.out.println("b run begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b run end time="+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void bSerevice(){
        System.out.println("打印了 bService time="+System.currentTimeMillis());
    }
}
