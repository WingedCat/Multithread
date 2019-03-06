package Thread2_2.Thread2_2_9.synBlockMoreObjectOneLock;

public class Service {
    /**
     * synchronized应用在static方法上对当前的java文件对应的Class类进行加锁
     */
    public static void printA(){
        synchronized (Service.class){
            try {
                System.out.println("线程名称为："+ Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printA");
                Thread.sleep(3000);
                System.out.println("线程名称为："+ Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printB(){
        synchronized (Service.class){
            System.out.println("线程名称为："+ Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printB");
            System.out.println("线程名称为："+ Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printB");
        }
    }
}