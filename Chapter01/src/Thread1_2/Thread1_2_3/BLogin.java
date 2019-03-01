package Thread1_2.Thread1_2_3;

public class BLogin extends Thread {
    @Override
    public void run(){
        LoginServlet.doPost("b","bb");
    }
}
