package ca.uwaterloo.cs446.designpatterns.singleton;

public class Singleton {
    private static Singleton instance = null;

    private static int creationCount = 0;

    private Singleton() {
        creationCount++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static int getCreationCount() {
        return creationCount;
    }
}
