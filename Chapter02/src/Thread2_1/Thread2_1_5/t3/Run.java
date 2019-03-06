package Thread2_1.Thread2_1_5.t3;

public class Run {
    public static void main(String[] args) {
        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA thread = new ThreadA(publicVarRef);
            thread.start();
            Thread.sleep(200);//打印结果受此值影响
            publicVarRef.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
     * setValue()方法未执行完我们就获取值，导致获取的数据不准确（脏读），我们只留意了set值时的同步，get值时也要同步。
     * getValue method thread name=main username=B password=AA
     * setValue method thread name=Thread-0 username=B password=BB
     */

    /**
     * 都设为同步后先set再get避免了脏读
     * setValue method thread name=Thread-0 username=B password=BB
     * getValue method thread name=main username=B password=BB
     */
}
