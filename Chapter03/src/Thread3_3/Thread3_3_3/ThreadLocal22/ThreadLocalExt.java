package Thread3_3.Thread3_3_3.ThreadLocal22;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue(){
        return "我是默认值，确保第一次get时不为null";
    }
}
