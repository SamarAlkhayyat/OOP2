package pkg;

public class Demo {
    public static void main(String[] args) {
        FactoryTest f = new FactoryTest();
        A a1 = f.creatImp(1);
        A a2 = f.creatImp(2);
        a1.m1();
        a2.m1();
    }
}
