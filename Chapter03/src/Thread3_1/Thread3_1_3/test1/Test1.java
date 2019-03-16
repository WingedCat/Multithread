package Thread3_1.Thread3_1_3.test1;

public class Test1 {
    public static void main(String[] args) {
        try {
            String newString = new String("");
            newString.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        /**
         * wait()方法未在同步方法或同步块中调用，直接抛异常
         * Exception in thread "main" java.lang.IllegalMonitorStateException
         * 	at java.lang.Object.wait(Native Method)
         * 	at java.lang.Object.wait(Object.java:502)
         * 	at Test1.main(Test1.java:7)
         */
    }
}
