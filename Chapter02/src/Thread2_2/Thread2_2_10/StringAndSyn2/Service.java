package Thread2_2.Thread2_2_10.StringAndSyn2;

public class Service {
    public static void print(Object object){
        try{
            synchronized (object){
                while (true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
