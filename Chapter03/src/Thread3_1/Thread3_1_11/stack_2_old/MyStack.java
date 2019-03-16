package Thread3_1.Thread3_1_11.stack_2_old;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List list = new ArrayList();

    synchronized public void push(){
        try{
            if(list.size()==1){
                this.wait();
            }
            list.add("anything="+Math.random());
            this.notify();
            System.out.println("push="+list.size());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public String pop(){
        String returnValue = "";
        try{
            if(list.size()==0){
                System.out.println("pop操作中的："+Thread.currentThread().getState()+"线程呈wait状态");
                this.wait();
            }
            returnValue = ""+list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop="+list.size());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return returnValue;
    }
}
