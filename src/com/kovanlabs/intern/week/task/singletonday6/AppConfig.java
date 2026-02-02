package com.kovanlabs.intern.week.task.singletonday6;

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class AppConfig {
    public static void main(String[] args) {
        Singleton A,B,C,D;
        A = Singleton.getInstance();
        System.out.println("Main Method A :"+A.hashCode());
        B = Singleton.getInstance();
        System.out.println("Main Method B :"+B.hashCode());
        C = Singleton.getInstance();
        System.out.println("Main Method C :"+C.hashCode());
        D = Singleton.getInstance();
        System.out.println("Main Method D :"+D.hashCode());
    }

}
