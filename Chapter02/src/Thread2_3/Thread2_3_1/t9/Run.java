package Thread2_3.Thread2_3_1.t9;

public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("I want to stop it!");
        printString.setContinuePrint(false);
        /**
         * main线程一直在处理循环，所以无法执行下面的语句，自然无法停止了。
         */
    }
}
