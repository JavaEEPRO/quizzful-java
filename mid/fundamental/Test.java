package mid.fundamental;

public class Test {
    public static void main(String[] s) {
        long c = 1;

        switch (/*(int)*/c) {            // compilation error, switch expects char, byte, short, int or enum, but found long
            case 1: c = 3; break;
            case 3: c = 4; break;
        }
        System.out.println(c);
    }
}
