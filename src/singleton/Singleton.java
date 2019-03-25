package singleton;

public class Singleton {
    private static Singleton singleton = null;
    // instance singleton

    private Singleton() {
    }
    // constructor mode private agar tidak dapat diambil oleh kelas lain

    public static Singleton getInstance() {
        //instansi singleton
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

     public static void testMethod() {
        System.out.println("Test method singleton");
    }
}
