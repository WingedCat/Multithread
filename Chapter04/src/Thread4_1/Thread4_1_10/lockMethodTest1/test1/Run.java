package Thread4_1.Thread4_1_10.lockMethodTest1.test1;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        service.serviceMethod1();
        /**
         * serviceMethod1 getHoldCount=1
         * serviceMethod2 getHoldCount=2
         */
    }
}
