package Thread1_7.Thread1_7_3.t13;

/**
 * 单纯使用break只是跳出了for循环而已，线程并没有停止
 * 我们现在使用抛异常的方式停止线程
 */
public class MyThread3 extends Thread{
    @Override
    public void run(){
        try {
            for(int i = 0;i < 500000;i++){
                if(this.interrupted()){
                    System.out.println("已经停止状态了！我要退出了~");
                    throw new InterruptedException();
                }
                System.out.println("i = "+ (i+1));
            }
            System.out.println("for 循环之后的语句！");
        } catch (InterruptedException e) {
            System.out.println("进入catch中了~");
            e.printStackTrace();
        }

    }
}
