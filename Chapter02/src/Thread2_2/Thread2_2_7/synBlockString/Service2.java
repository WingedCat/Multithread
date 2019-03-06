package Thread2_2.Thread2_2_7.synBlockString;

public class Service2 {
    private String username;
    private String password;

    public void setUsernamePassword(String username,String password){
        String anyString = new String();
        try {
            synchronized (anyString){
                System.out.println("线程名称为："+Thread.currentThread().getName()+" 在"+System.currentTimeMillis()+"进入同步块");
                this.username = username;
                Thread.sleep(3000);
                this.password = password;
                System.out.println("线程名称为："+Thread.currentThread().getName()+" 在"+System.currentTimeMillis()+"离开同步块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
