package pkg;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(10);
        s1.setName("Samar");
        s1.setGpa(3.1);
        s1.setEmail("s@s.com");
        
        Student s2 = new Student(11, "Nada", 4, "n@n.com");
        
        Student s3 = new Student();
        s3.withId(12).withName("Raghad").withGpa(2.7).withEmail("g@g.com");
    }
}
