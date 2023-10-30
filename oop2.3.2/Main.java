package oop2.3.2;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 3;
        System.out.println(c1.getRound()+"\n"+c1.getArea());
        Circle c2 = new Circle();
        c2.radius = 10;
        System.out.println(c2.getRound()+"\n"+c2.getArea());
    }
    
}
