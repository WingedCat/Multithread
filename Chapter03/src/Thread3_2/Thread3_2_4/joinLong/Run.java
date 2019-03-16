package Thread3_2.Thread3_2_4.joinLong;

public class Run {
    public static void main(String[] args) {
        try {
            System.out.println("Main begin time="+System.currentTimeMillis());
            MyThread threadTest = new MyThread();
            threadTest.start();
            threadTest.join(2000);//只等待两秒
            System.out.println("Main end time="+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * Main begin time=1552737055035
         * MyThread begin time=1552737055036
         * Main end time=1552737060036
         * MyThread end time=1552737065037
         */
    }
}
