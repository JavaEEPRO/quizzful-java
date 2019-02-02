package mid.fundamental;

public class Main {
    static int a, b;
    public static void main(String[] args) {
        if(!(++a==0&&++b==0)) System.out.print("true a+b=");      // condition is true, counted only left part, right ignored  
        else System.out.print("false a+b=");
        System.out.print(a+b);                                    //  true a+b=1
    }
}
