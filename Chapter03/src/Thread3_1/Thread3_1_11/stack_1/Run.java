package Thread3_1.Thread3_1_11.stack_1;

public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C r = new C(myStack);

        P_Thread pThread = new P_Thread(p);
        C_Thread rThread = new C_Thread(r);
        pThread.start();
        rThread.start();
    }
}
