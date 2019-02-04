package mid.genericsCollections;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void removeAndPrint(List<String> list) {
        for(String str: list) {
            if(str.equals("two")) {
                list.remove("three");       // ConcurrentModificationException thrown, when iterating List, it is immutable, runtime error proceeded
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        removeAndPrint(list);
    }
}
