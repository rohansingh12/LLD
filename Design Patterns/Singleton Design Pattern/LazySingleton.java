public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){
        //Private method to prevent object prevention of the class
    }

    public static LazySingleton getInstance(){
        if(instance==null){
            //Create an instance only if it was null
            instance= new LazySingleton();
        }
        return instance;
    }
}
