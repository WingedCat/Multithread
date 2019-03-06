package Thread2_2.Thread2_2_7.t9;

public class MyService {
    public MyOneList addServiceMethod(MyOneList list,String data){
        try {
            synchronized (list){
                if(list.getSize() < 1){
                    Thread.sleep(2000);//模拟从远程花费2s取回数据
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
