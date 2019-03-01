package Thread1_2.Thread1_2_3;

public class Run5 {
    public static void main(String[] args) {
        SafeALogin aLogin = new SafeALogin();
        aLogin.setName("ALogin");
        aLogin.start();
        SafeBLogin bLogin = new SafeBLogin();
        bLogin.setName("BLogin");
        bLogin.start();

        /**安全！
         * AALogin username = a , passwordRef = aa
         * BLogin username = b , passwordRef = bb
         */
    }
}
