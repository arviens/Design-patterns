package util;

import game.environment.abstractObject.common.AbstractCollidable;

import java.util.ArrayList;
import java.util.List;

public class Drawable {
    private static List<AbstractCollidable> environmentObjects = new ArrayList<AbstractCollidable>();
    private static Drawable instance;

    public static synchronized Drawable getInstance() {
        createInstance();
        return instance;
    }

    private static synchronized void createInstance() {
        if (instance == null) {
            instance = new Drawable();
        }
    }

    public static synchronized void insertObject(AbstractCollidable collidable) {
        createInstance();
        environmentObjects.add(collidable);
    }

    public static synchronized void removeObject(AbstractCollidable collidable) {
        createInstance();
        environmentObjects.remove(collidable);
    }

    public static synchronized List<AbstractCollidable> getEnvironmentObjects() {
        createInstance();
        return environmentObjects;
    }
}









