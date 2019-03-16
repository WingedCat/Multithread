package Thread3_1.Thread3_1_11.p_c_allWait;

public class P {
    private String lock;

    public P(String lock){
        this.lock = lock;
    }

    public void setValue(){
        try{
            synchronized (lock){
                while(!ValueObject.value.equals("")){
                    System.out.println("生产者"+Thread.currentThread().getName()+"WAITING了★");
                    lock.wait();
                }
                System.out.println("生产者"+Thread.currentThread().getName()+"RUNNABLE了");
                String value = System.currentTimeMillis()+"_"+System.nanoTime();
                System.out.println("set 的值是："+value);
                ValueObject.value = value;
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
