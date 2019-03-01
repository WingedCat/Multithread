package Thread1_7.Thread1_7_2.t12;

public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();//使main线程中断
        System.out.println("是否停止1？ = " + Thread.interrupted());
        System.out.println("是否停止2？ = " + Thread.interrupted());
        System.out.println("end~");
        /**
         * 是否停止1？ = true
         * 是否停止2？ = false
         * end~
         * 第一次判断main线程中断了，为什么第二次判断返回false呢？
         The interrupted status of the thread is cleared by this method.  In
         other words, if this method were to be called twice in succession, the
         second call would return false.
         */
    }
}
