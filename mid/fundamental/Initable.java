package mid.fundamental;
import java.util.Random;

public class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Инициализация Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Инициализация Initable2");                  // only "Инициализация Initable2" should be printed to the console
    }
}

class ClassInitialization {

    public static Random rand = new Random(47);
    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        Class initable2 = Class.forName("mid.fundamental.Initable2");
    }
}
