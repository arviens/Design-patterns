package util;

import game.environment.abstractObject.common.AbstractCollidable;

import java.io.FileNotFoundException;
import java.util.List;

public class Drawable {
    private static List<AbstractCollidable> environmentObjects;
    private static Drawable instance;

    public static synchronized Drawable getInstance() {
        if (instance == null) {
            instance = new Drawable();
        }
        return instance;
    }

    public static synchronized void insertObject(AbstractCollidable collidable) {
        environmentObjects.add(collidable);
    }

    public static synchronized void removeObject(AbstractCollidable collidable) {
        environmentObjects.remove(collidable);
    }

    public static synchronized List<AbstractCollidable> getEnvironmentObjects() {
        return environmentObjects;
    }
}









