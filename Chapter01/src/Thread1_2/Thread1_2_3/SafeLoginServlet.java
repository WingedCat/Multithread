package Thread1_2.Thread1_2_3;

public class SafeLoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    synchronized public static void doPost(String username,String password){
        try{
            usernameRef = username;
            if(username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println(Thread.currentThread().getName() + " username = " + usernameRef + " , passwordRef = "+ passwordRef);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
