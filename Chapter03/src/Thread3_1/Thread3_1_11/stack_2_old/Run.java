package Thread3_1.Thread3_1_11.stack_2_old;

/**
 * 一生产者--多消费者
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C r1 = new C(myStack);
        C r2 = new C(myStack);
        C r3 = new C(myStack);
        C r4 = new C(myStack);
        C r5 = new C(myStack);

        P_Thread pThread = new P_Thread(p);
        C_Thread rThread1 = new C_Thread(r1);
        C_Thread rThread2 = new C_Thread(r2);
        C_Thread rThread3 = new C_Thread(r3);
        C_Thread rThread4 = new C_Thread(r4);
        C_Thread rThread5 = new C_Thread(r5);

        pThread.start();
        rThread1.start();
        rThread2.start();
        rThread3.start();
        rThread4.start();
        rThread5.start();

        /**
         * push=1
         * pop=0
         * pop=anything=0.9031735159419699
         * pop操作中的：RUNNABLE线程呈wait状态
         * pop操作中的：RUNNABLE线程呈wait状态
         * pop操作中的：RUNNABLE线程呈wait状态
         * pop操作中的：RUNNABLE线程呈wait状态
         * pop操作中的：RUNNABLE线程呈wait状态
         * Exception in thread "Thread-3" push=1
         * pop=0
         * pop=anything=0.1352129780141138
         * pop操作中的：RUNNABLE线程呈wait状态
         * java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
         * 	at java.util.ArrayList.rangeCheck(ArrayList.java:657)
         * 	at java.util.ArrayList.get(ArrayList.java:433)
         * 	at Thread3_1.Thread3_1_11.stack_2_old.MyStack.pop(MyStack.java:29)
         * 	at Thread3_1.Thread3_1_11.stack_2_old.C.popService(C.java:11)
         * 	at Thread3_1.Thread3_1_11.stack_2_old.C_Thread.run(C_Thread.java:13)
         */
    }
}
