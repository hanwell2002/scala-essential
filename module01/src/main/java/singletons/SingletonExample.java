package singletons;


//Lazy Instantiation
public class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample()
    {
        System.out.println("Singleton being initialized");
    }

    public static SingletonExample getInstance()
    {
        if(instance == null)
            instance = new SingletonExample();
        return instance;
    }


    public static void main(String[] args){

        //some other statement.
        //


        SingletonExample.getInstance();

    }
}