package Thread2_3.Thread2_3_2.t10;


public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        System.out.println("I want to stop it!");
        printString.setContinuePrint(false);
        /**
         * I want to stop it!
         * run printStringMethod threadName = Thread-0
         */
    }
}
