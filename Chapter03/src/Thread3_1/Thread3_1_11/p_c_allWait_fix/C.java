package Thread3_1.Thread3_1_11.p_c_allWait_fix;

public class C {
    private String lock="";

    public C(String lock){
        this.lock = lock;
    }

    public void getValue(){
        try{
            synchronized (lock){
                while(ValueObject.value.equals("")){
                    System.out.println("消费者"+Thread.currentThread().getName()+" WAITING了☆");
                    lock.wait();
                }
                System.out.println("消费者 "+Thread.currentThread().getName()+" RUNNABLE了");
                System.out.println("get 的值是："+ ValueObject.value);
                ValueObject.value = "";
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
