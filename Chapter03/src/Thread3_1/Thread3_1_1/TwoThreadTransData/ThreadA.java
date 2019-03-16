package Thread3_1.Thread3_1_1.TwoThreadTransData;

public class ThreadA extends Thread {
    private MyList list;

    public ThreadA(MyList list){
        this.list = list;
    }

    @Override
    public void run(){
        try{
            for(int i=0;i<10;i++){
                list.add();
                System.out.println("添加了"+(i+1)+"个元素");
                Thread.sleep(3000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
