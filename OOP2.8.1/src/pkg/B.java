package pkg;

public class B extends C{
    C c;

    public void setC(C c) {
        this.c = c;
    }
    
    public void process(){
        c.m1("xx");
    }
}
