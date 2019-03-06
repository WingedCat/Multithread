package Thread2_3.Thread2_3_4.volatileTestThread;

public class Run {
    public static void main(String[] args) {
        MyThread[] myThreadsArray = new MyThread[100];
        for(int i=0;i<100;i++){
            myThreadsArray[i] = new MyThread();
        }
        for(int i=0;i<100;i++){
            myThreadsArray[i].start();
        }
        /**
         * 最终结果不是10000，说明volatile不具备原子性
         */
    }
}
