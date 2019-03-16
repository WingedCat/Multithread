package Thread3_1.Thread3_1_10.waitOld;


public class Add {
    private String lock;

    public Add(String lock){
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            ValueObject.list.add("anything");
            lock.notifyAll();
        }
    }
}
