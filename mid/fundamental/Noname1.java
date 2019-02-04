package mid.fundamental;

public class Noname1 {
    public static void main(String[] args) {
        byte x = 0;
        byte y = (--x < 0) ? ++x : -x;  // cast to int cause of -x, cast to (byte) needed 
        System.out.println(y);
    }
}
