package mid.fundamental;

public class MyClass {

    public static void main(String[] args) {

        double d = 2.7;
        Box b = new Box();
        b.doMinus(d);                       //doMinus(d) will change state of it's local d variable, which is copy of main().d 
        System.out.println(d);              //prints main().d value, which still unchanged: 2.7
    }
}

class Box {
    public double d;

    public void doMinus(double d) {
        d = d - 1.0;
    }
}
