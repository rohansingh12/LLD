public class EagerSingleton{
    //This is an eager way of creating singleton instance.
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        //Private constructor to avoid object creation
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}

//Instance is created eagerly during application start