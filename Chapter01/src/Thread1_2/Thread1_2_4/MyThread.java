package Thread1_2.Thread1_2_4;

public class MyThread extends Thread {
    private int i = 5;

    @Override
    public void run(){
        /**
         * 在之前的项目中i--在println之前，现在将它放到println中
         */
        System.out.println("i = " + (i--) + "ThreadName = "+ Thread.currentThread().getName());
        /**
         * println方法内部是同步的，这能否避免线程安全问题呢？
         * public void println(String x) {
              synchronized (this) {
                  print(x);
                  newLine();
              }
          }
         */
    }
}
