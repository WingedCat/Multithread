package Thread3_4.Thread3_4_1.InheritableThreadLocal1;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue(){
        return System.currentTimeMillis();
    }
}
