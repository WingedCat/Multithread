package Thread3_2.Thread3_2_1.joinTest1;

public class Test {
    public static void main(String[] args) {
        MyThread threadTest = new MyThread();
        threadTest.start();
        System.out.println("我想当threadTest对象执行完毕后我再执行");
        System.out.println("但上面代码中的sleep()中的值应该写什么呢？");
        System.out.println("答案是：无法确定");
    }
}
