package Thread2_1.Thread2_1_8.synNotExtends;

public class Test {
    public static void main(String[] args) {
        Sub subRef = new Sub();
        ThreadA a = new ThreadA(subRef);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(subRef);
        b.setName("B");
        b.start();
        /**
         * 同步不能被继承：
         * int sub 下一步 sleep begin threadName=A time=1551597527582
         * int sub 下一步 sleep begin threadName=B time=1551597527583
         * int sub 下一步 sleep end threadName=B time=1551597532583
         * int main 下一步 sleep begin threadName=B time=1551597532583
         * int sub 下一步 sleep end threadName=A time=1551597532583
         * int main 下一步 sleep end threadName=B time=1551597537584
         * int main 下一步 sleep begin threadName=A time=1551597537584
         * int main 下一步 sleep end threadName=A time=1551597542585
         */

        /***
         * 给子类方法加上synchronized后：
         * int sub 下一步 sleep begin threadName=A time=1551597730542
         * int sub 下一步 sleep end threadName=A time=1551597735543
         * int main 下一步 sleep begin threadName=A time=1551597735543
         * int main 下一步 sleep end threadName=A time=1551597740544
         * int sub 下一步 sleep begin threadName=B time=1551597740544
         * int sub 下一步 sleep end threadName=B time=1551597745545
         * int main 下一步 sleep begin threadName=B time=1551597745545
         * int main 下一步 sleep end threadName=B time=1551597750545
         */
    }
}
