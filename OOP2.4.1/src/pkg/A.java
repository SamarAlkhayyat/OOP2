package pkg;

public class A implements Speaker{
    public void m1(){
        System.out.println("Hello from A");
    }
    @Override
    public void hello(){
        System.out.println("Hello from A, again");
    }
}
