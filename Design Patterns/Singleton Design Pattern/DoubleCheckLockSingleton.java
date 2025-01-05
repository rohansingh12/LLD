
public class DoubleCheckLockSingleton {
    //Volatile ensures no thread reordering issue occurs.
    private static volatile DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton(){
        //Private Constructor to avoid object creation of the class
    }

    public static DoubleCheckLockSingleton getInstance(){
        //First check without locking
        if(instance==null){
            //Second Check with locking, synchronization on the class
            synchronized (DoubleCheckLockSingleton.class){
                if(instance==null){
                    //Only one thread creates the instance when multiple threads reach outside if 
                    instance= new DoubleCheckLockSingleton();
                }
                
            }
        }
        return instance;
    }
}
//The first null check allows most threads to skip synchronization once the instance is initialized
