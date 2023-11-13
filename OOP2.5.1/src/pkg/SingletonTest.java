package pkg;

public class SingletonTest {
    private static SingletonTest instance; //could = new SingletonTest();
                                           //then the if statment in the SingletonTest method won't be needed

    private SingletonTest(){
        System.out.println("new object has been created");
    }
    
    public static SingletonTest getInstance(){
        if(instance == null){
            instance = new SingletonTest();
        }
        return instance;
    }
    
    public void hello(){
        System.out.println("hello from singleton");
    }
}
