package Thread3_2.Thread3_2_2.joinTest2;

public class MyThread extends Thread {
    @Override
    public void run(){
        try{
            int secondValue = (int)(Math.random()*1000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
