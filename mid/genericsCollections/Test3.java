  package mid.genericsCollections;

import java.util.*;

public class Test3<T> implements Iterable<T> {

    private List<T> list = new ArrayList<T>();

    public void addList(T... ts) {
        Collections.addAll(list, ts);
    }

    public static void main(String[] args) {
        Test3<String> t = new Test3<String>();
        t.addList("Hello","world","!");
        for(String str : t) {
            System.out.print(str + " ");            // Hello world !
        }
    }

    public Iterator<T> iterator() {
        return new Iterator() {
            private int index = 0;

            public boolean hasNext() {
                return index > list.size();
            }

            public Object next() {
                return list.get(index++);
            }

            public void remove() {
                throw new UnsupportedOperationException("unsupported operation");
            }
        };
    }
}
