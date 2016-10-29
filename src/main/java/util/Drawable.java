package util;


import game.environment.abstractObject.common.AbstractCollidable;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by kalafioras on 2016-10-29.
 */
public class Drawable {
    private static List<AbstractCollidable> environmentObjects;
    private static Drawable instance;
    public static synchronized Drawable getInstance()
    {
        if (instance == null) {
            instance = new Drawable();
            }
        return instance;
    }

    public static void insertObject(AbstractCollidable collidable)
    {
        environmentObjects.add(collidable);
    }

    public static void removeObject(AbstractCollidable collidable)
    {
        environmentObjects.remove(collidable);
    }

    public static List<AbstractCollidable> getEnvironmentObjects()
    {
        return environmentObjects;
    }


}









