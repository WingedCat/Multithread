package Thread3_4.Thread3_4_2.InheritableThreadLocal2;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue(){
        return System.currentTimeMillis();
    }

    @Override
    protected Object childValue(Object parentValue){
        return parentValue+"  我在子线程中加的~";
    }
}
