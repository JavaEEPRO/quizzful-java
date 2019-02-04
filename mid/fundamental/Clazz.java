package mid.fundamental;

public class Clazz {
    {
        System.out.println("non-static init");
    }
    public static void main(String[] args) {
        System.out.println("main");
        Clazz ob1 = new Clazz();
    }                                                   // static init  ->  main  -> non-static init 
    static {
        System.out.println("static init");
    }
}
