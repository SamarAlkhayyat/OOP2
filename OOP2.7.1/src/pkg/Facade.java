package pkg;

public class Facade {
    public Subsystem1 subsystem1;
    public Subsystem2 subsystem2;
    
    public Facade(){
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
    }
    
    public void operate(){
        System.out.println("Facade is coordenating the subsystems:");
        subsystem1.operation1();
        subsystem2.operation2();
    }//the declaration can be with the inisialization
}
