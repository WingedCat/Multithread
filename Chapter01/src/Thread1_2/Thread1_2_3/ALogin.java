package Thread1_2.Thread1_2_3;

public class ALogin extends Thread {
    @Override
    public void run(){
        LoginServlet.doPost("a","aa");
    }
}
