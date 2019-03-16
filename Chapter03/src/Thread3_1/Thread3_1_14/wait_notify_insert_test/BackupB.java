package Thread3_1.Thread3_1_14.wait_notify_insert_test;

public class BackupB extends Thread {
    private DBTools dbTools;

    public BackupB(DBTools dbTools){
        this.dbTools = dbTools;
    }

    @Override
    public void run(){
        dbTools.backupB();
    }
}
