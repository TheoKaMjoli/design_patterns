package singleton_pattern;
public class Singleton_Example {
    /* Early instantiation */
    private static Singleton_Example singleInstance = new Singleton_Example(); //instance is created at load time
    private Singleton_Example(){ } // making the constructor private, the class will not be instantiated

    public static Singleton_Example getSingletonInstance(){ //our global point of access
       if(null == singleInstance){
            singleInstance = new Singleton_Example();
       }
        return singleInstance;
    }
    public void printSingleton(){
        System.out.println("Inside print Singleton");
    }
}
