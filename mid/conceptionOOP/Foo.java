public class Foo {
    public static void main(String[] args) {
        class Horse {
            String name;
            public Horse (String s) {
                name = s;
            }
        }
        Object obj = new Horse("Zippo");
        System.out.println(((Horse) obj).name);     // class Object has no public field "name"; compil. error
    }
}
