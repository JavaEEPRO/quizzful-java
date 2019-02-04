package mid.innerClasses;

public class Test {
    private String helloString = "Hello.";

    public Test(int i) {
        class Inner {
            public Inner(String str) {
                                                        // System.out.println(Test.this.helloString);
            }
        }
        Inner inner = new Inner("Goodbye.");
    }
}
