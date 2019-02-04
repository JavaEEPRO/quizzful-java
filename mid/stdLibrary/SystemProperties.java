package mid.stdLibrary;

import java.util.*;

public class SystemProperties {
    public static void main(String[] args) {              // running this prog as java -D1=one -D1=three SystemProperties 2 two returns: threetwonull
        Properties props = System.getProperties();
        props.put(args[0], args[1]);

        System.out.println(props.get("1"));
        System.out.println(props.get("2"));
        System.out.println(props.get("3"));
    }
}
