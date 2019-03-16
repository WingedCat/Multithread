package Thread3_2.Thread3_2_4.joinLong;

public class MyThread extends Thread {
    @Override
    public void run(){
        try {
            System.out.println("MyThread begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("MyThread end time="+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
