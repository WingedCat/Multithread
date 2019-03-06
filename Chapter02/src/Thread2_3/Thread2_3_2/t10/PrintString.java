package Thread2_3.Thread2_3_2.t10;

public class PrintString implements Runnable {
    private boolean isContinuePrint = true;

    public boolean isContinuePrint(){
        return isContinuePrint;
    }

    public void setContinuePrint(boolean isContinuePrint){
        this.isContinuePrint = isContinuePrint;
    }

    public void printStringMethod(){
        try {
            while(isContinuePrint){
                System.out.println("run printStringMethod threadName = "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        this.printStringMethod();
    }
}
