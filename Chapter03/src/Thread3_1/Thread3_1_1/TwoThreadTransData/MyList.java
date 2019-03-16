package Thread3_1.Thread3_1_1.TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List list = new ArrayList();

    public void add(){
        list.add("Test");
    }

    public int size(){
        return list.size();
    }
}
