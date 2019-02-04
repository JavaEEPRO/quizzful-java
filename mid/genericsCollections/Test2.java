package mid.genericsCollections;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        for (int i =0; i<10; i++) {
            list.add(i+"");
        }
        for (Object e1: list) {
            for (Object e2: list) {
                if (e1.equals(e2)) {
                    list.remove(e1);        //ConcurrentModificationException thrown, runtime error expected
                    list.remove(e2);
                }
            }
        }
        System.out.println(list.size());
    }
}
