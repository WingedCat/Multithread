package Thread2_1.Thread2_1_2.t2;

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();

        /**
         * 未使用synchronized时：
         * num是实例变量，会造成线程安全问题。
         * a set over
         * b set over
         * b  num = 200
         * a  num = 200
         */

        /**
         * 使用synchronized后：
         * a set over
         * a  num = 100
         * b set over
         * b  num = 200
         */
    }
}
