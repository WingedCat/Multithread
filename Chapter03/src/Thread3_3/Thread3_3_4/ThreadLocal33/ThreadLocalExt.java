package Thread3_3.Thread3_3_4.ThreadLocal33;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue(){
        return System.currentTimeMillis();
    }
}
