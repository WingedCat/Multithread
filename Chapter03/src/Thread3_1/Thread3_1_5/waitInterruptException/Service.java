package Thread3_1.Thread3_1_5.waitInterruptException;

public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait");
                lock.wait();
                System.out.println("  end wait");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("出异常了，因为wait状态的线程被interrupt了~");
        }
    }
}
