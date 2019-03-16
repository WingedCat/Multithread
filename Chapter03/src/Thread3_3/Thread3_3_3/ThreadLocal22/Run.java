package Thread3_3.Thread3_3_3.ThreadLocal22;

public class Run {
    private static ThreadLocalExt threadLocalExt = new ThreadLocalExt();

    public static void main(String[] args) {
        if(threadLocalExt.get()==null){
            System.out.println("第一次get，为null");
            threadLocalExt.set("第一次set");
        }
        System.out.println(threadLocalExt.get());
        threadLocalExt.set("第二次set");
        System.out.println(threadLocalExt.get());
        /**
         * 我是默认值，确保第一次get时不为null
         * 第二次set
         */
    }
}
