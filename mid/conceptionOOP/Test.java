package mid.conceptionOOP;

public class Test {
    public static void main(String[] args) {
        int x =0, y = 0;

        for(int z=0; z<4; z++) {
            if ((++x > 2) || ( ++y > 2)) {          //when first condition (left) is counted as true, 
                x++;                                //other'll be not called and counted at all, and it's stage ++y will be ignored too
            }
        }
        System.out.println(x + " " + y);            //  x:6   y:2
    }
}
