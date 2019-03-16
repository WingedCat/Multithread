package Thread3_1.Thread3_1_4.waitReleaseLock;

public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait");
//                lock.wait();
                Thread.sleep(2000);//sleep方法不会释放锁，最终是同步效果
                System.out.println("end wait");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
