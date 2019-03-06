package Thread2_3.Thread2_3_7.synchronizedUpdateNewValue;

public class Service {
    private boolean isContinueRun = true;

    public void runMethod(){
        String anyString = new String();
        while(isContinueRun){
            synchronized (anyString){
                //synchronized可以具有可视性
            }
        }
        System.out.println("停下来了");
    }

    public void stopMethod(){
        isContinueRun = false;
    }
}
