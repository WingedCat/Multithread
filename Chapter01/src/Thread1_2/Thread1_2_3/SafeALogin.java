package Thread1_2.Thread1_2_3;

public class SafeALogin extends Thread {
    @Override
    public void run(){
        SafeLoginServlet.doPost("a","aa");
    }
}
