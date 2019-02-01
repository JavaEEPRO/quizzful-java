package mid.conceptionOOP;

import java.io.*;

public class NewClass {             // deserialization calls superclass init, so, "1 Base.Base()" after deserialization will be printed externally (again)

    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        ObjectOutputStream oOut = new ObjectOutputStream(bOut);
        oOut.writeObject(new Sub());
        System.out.println("");

        ByteArrayInputStream bIn = new ByteArrayInputStream(bOut.toByteArray());
        ObjectInputStream oIn = new ObjectInputStream(bIn);
        oIn.readObject();
    }
}

class Base {
    private int baseField = getInt(1);

    public Base() {
        System.out.print("Base.Base() ");
    }

    protected int getInt(int i) {
        System.out.print(i + " ");
        return i;
    }
}

class Sub extends Base implements Serializable {
    private int subField = getInt(2);

    public Sub() {
        System.out.print("Sub.Sub() ");
    }
}
