package Thread3_1.Thread3_1_14.wait_notify_insert_test;

public class BackupA extends Thread {
    private DBTools dbTools;

    public BackupA(DBTools dbTools){
        this.dbTools = dbTools;
    }

    @Override
    public void run(){
        dbTools.backupA();
    }
}
