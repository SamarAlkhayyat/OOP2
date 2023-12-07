package pkg;

public class Test {
    public static void main(String[] args) {
        B b1 = new B();
        C c1 = new D();
        b1.setC(c1);
        b1.process();
        
        B b2 = new B();
        C c2 = new C();        
        b2.setC(c2);
        b2.process();
    }
}
