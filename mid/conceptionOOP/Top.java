package mid.conceptionOOP;

class Top {
    //public Top() {}
    public Top(String s) {System.out.print("B");}
}

class Bottom2 extends Top {

    public Bottom2(String s) {              // class Top have no default constructor (without param),
        //super(s);                         // and child class constructor have no call to any of declared constructors of superclass,
        System.out.print("D");}             // one of this steps is "must have" for successfully compilation
    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}
