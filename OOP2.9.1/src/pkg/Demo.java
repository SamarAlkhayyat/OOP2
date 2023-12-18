package pkg;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.addListener(b);
        a.addListener(new X());
        a.m1();
    }
}
