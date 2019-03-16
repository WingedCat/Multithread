package Thread3_1.Thread3_1_14.wait_notify_insert_test;

public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for(int i=0;i<10;i++){
            BackupB outPut = new BackupB(dbTools);
            outPut.start();
            BackupA inPut = new BackupA(dbTools);
            inPut.start();
        }
        /**
         * ★★★★★
         * ☆☆☆☆☆
         * ★★★★★
         * ☆☆☆☆☆
         * ★★★★★
         * ☆☆☆☆☆
         * ★★★★★
         * ☆☆☆☆☆
         * ★★★★★
         * ☆☆☆☆☆
         * ★★★★★
         * ☆☆☆☆☆
         * ★★★★★
         * ☆☆☆☆☆
         * ★★★★★
         * ☆☆☆☆☆
         * ★★★★★
         * ☆☆☆☆☆
         * ★★★★★
         * ☆☆☆☆☆
         */
    }
}
