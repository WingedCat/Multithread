package Thread1_2.Thread1_2_3;

public class SafeBLogin extends Thread {
    @Override
    public void run(){
        SafeLoginServlet.doPost("b","bb");
    }
}
