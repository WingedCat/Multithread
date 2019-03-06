package Thread2_3.Thread2_3_3.t11;

public class RunThread extends Thread {
    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while(isRunning){

        }
        System.out.println("run 停止了");
    }
}
