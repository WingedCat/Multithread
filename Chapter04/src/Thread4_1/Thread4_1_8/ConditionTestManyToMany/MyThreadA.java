package Thread4_1.Thread4_1_8.ConditionTestManyToMany;

public class MyThreadA extends Thread {
    private MyService service;

    public MyThreadA(MyService service){
        this.service = service;
    }

    @Override
    public void run(){
        for(int i=0;i<Integer.MAX_VALUE;i++){
            service.set();
        }
    }
}
