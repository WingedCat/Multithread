package Thread1_2.Thread1_2_3;

public class Run4 {
    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        aLogin.setName("ALogin");
        aLogin.start();
        BLogin bLogin = new BLogin();
        bLogin.setName("BLogin");
        bLogin.start();
        /**
         * ALogin出错了！！
         * BLogin username = b , passwordRef = bb
         * ALogin username = b , passwordRef = aa
         */
    }
}
