package patterns.singleton;

public class Singleton {

    private static volatile  Singleton singleton;

    private Singleton(){}


    private static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    return new Singleton();
                }
            }
        }
        return singleton;
    }
}
