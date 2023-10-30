package oop2.3.2;

public class Circle {
    double radius;

    public double getRound(){
        double round = 2*radius*3.14;
        return round;
    }
    public double getArea(){
        double area = 3.14*radius*radius;
        return area;
    }
}
