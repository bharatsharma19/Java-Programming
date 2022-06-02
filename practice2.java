class MyDeprecated {
    @Deprecated
    void meth1() {
        System.out.println("Method 1");
    }
}

interface MyInt {
    void display();
}

public class practice2 {
    public static void main(String[] args) {
        MyDeprecated d = new MyDeprecated();
        d.meth1();
        MyInt i = () -> System.out.println("Display Method");
    }
}
