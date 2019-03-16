package Thread3_1.Thread3_1_11.stack_2_new;

/**
 * 一生产者--多消费者 fix exception
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
         * pop=anything=0.3818530993814847
         * pop操作中的：RUNNABLE线程呈wait状态
         * pop操作中的：RUNNABLE线程呈wait状态
         * pop操作中的：RUNNABLE线程呈wait状态
         * pop操作中的：RUNNABLE线程呈wait状态
         * pop操作中的：RUNNABLE线程呈wait状态
         * push=1
         * pop=0
         * pop=anything=0.4042050174724018
         * pop操作中的：RUNNABLE线程呈wait状态
         * pop操作中的：RUNNABLE线程呈wait状态
         * 将if换为while后没有出现stack_2_old中的异常情况，但是程序出现假死。
         */
    }
}
