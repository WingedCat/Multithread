package Thread2_1.Thread2_1_1.t1;

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
        /**
         * num是方法内部的变量，是私有的，永远不会造成线程安全问题。
         * a set over
         * b set over
         * b  num = 200
         * a  num = 100
         */
    }
}
