package Thread1_7.Thread1_7_3.t13;

public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 0;i < 500000;i++){
            if(this.interrupted()){
                System.out.println("已经停止状态了！我要退出了~");
                break;
            }
            System.out.println("i = "+ (i+1));
        }
    }
}
