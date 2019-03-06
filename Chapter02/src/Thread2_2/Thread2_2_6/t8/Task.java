package Thread2_2.Thread2_2_6.t8;

public class Task {
    synchronized public void otherMethod(){
        System.out.println("---------------run ---otherMethod");
    }

    public void doLongTimeTask(){
        synchronized (this){//锁定当前对象
            for(int i=0;i<10000;i++){
                System.out.println("synchronized threadName = "+Thread.currentThread().getName()+"  i="+(i+1));
            }
        }
    }
}
