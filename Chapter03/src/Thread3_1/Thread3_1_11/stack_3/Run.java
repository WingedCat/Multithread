package Thread3_1.Thread3_1_11.stack_3;

/**
 * 多生产者--一消费者
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        C r = new C(myStack);
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);

        C_Thread rThread = new C_Thread(r);
        P_Thread pThread1 = new P_Thread(p1);
        P_Thread pThread2 = new P_Thread(p2);
        P_Thread pThread3 = new P_Thread(p3);
        P_Thread pThread4 = new P_Thread(p4);
        P_Thread pThread5 = new P_Thread(p5);

        rThread.start();
        pThread1.start();
        pThread2.start();
        pThread3.start();
        pThread4.start();
        pThread5.start();


    }
}
