package Thread3_1.Thread3_1_3.wait_notify_size5;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private static List list = new ArrayList();

    public static void add(){
        list.add("Test");
    }

    public static int size(){
        return list.size();
    }
}
