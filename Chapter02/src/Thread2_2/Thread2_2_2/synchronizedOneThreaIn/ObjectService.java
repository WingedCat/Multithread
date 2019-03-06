package Thread2_2.Thread2_2_2.synchronizedOneThreaIn;

public class ObjectService {
    public void serviceMethod(){
        try {
            synchronized (this){
                System.out.println("begin Time="+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end time="+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
