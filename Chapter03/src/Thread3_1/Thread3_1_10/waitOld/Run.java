package Thread3_1.Thread3_1_10.waitOld;

public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract threadSubtract = new ThreadSubtract(subtract);
        threadSubtract.setName("subtract1Thread");
        threadSubtract.start();
        ThreadSubtract threadSubtract2 = new ThreadSubtract(subtract);
        threadSubtract2.setName("subtract2Thread");
        threadSubtract2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadAdd addThread = new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();
    }
    /**
     * wait begin ThreadName=subtract1Thread
     * wait begin ThreadName=subtract2Thread
     * wait end ThreadName=subtract2Thread
     * list size=0
     * wait end ThreadName=subtract1Thread
     * Exception in thread "subtract1Thread" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
     * 	at java.util.ArrayList.rangeCheck(ArrayList.java:657)
     * 	at java.util.ArrayList.remove(ArrayList.java:496)
     * 	at Thread3_1.Thread3_1_10.waitOld.Subtract.subtract(Subtract.java:18)
     * 	at Thread3_1.Thread3_1_10.waitOld.ThreadSubtract.run(ThreadSubtract.java:12)
     */
}
