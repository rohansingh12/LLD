public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){
        //Private constructor to avoid creation of the object
    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance==null){
            instance= new ThreadSafeSingleton();
        }
        return instance;
    } 
}
//This method is safe for thread use
//Process is expensive
