package Thread3_3.Thread3_3_1.ThreadLocal11;

public class Run {
    public static ThreadLocal threadLocal = new ThreadLocal();
    public static void main(String[] args) {
        if(threadLocal.get()==null){
            System.out.println("从未放过值");
            threadLocal.set("设置值");
        }
        System.out.println(threadLocal.get());
        System.out.println(threadLocal.get());
    }
}
