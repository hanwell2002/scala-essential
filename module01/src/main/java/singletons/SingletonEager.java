package singletons;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager()
    {
        System.out.println("SingletonEager being initialized");
    }

    public static SingletonEager getInstance()
    {
        return instance;
    }


    public static void main(String[] args){

        //some other statement.
        //


       // SingletonEager.getInstance();

    }


}