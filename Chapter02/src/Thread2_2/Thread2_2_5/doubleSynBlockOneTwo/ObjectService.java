package Thread2_2.Thread2_2_5.doubleSynBlockOneTwo;

public class ObjectService {
    public void serviceMethodA(){
        try {
            synchronized (this){
                System.out.println("A begin Time="+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end time="+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin Time="+System.currentTimeMillis());
            System.out.println("B end time="+System.currentTimeMillis());
        }
    }
}
