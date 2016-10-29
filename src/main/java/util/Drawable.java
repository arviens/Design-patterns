package util;

import game.environment.abstractObject.common.AbstractCollidable;
import game.environment.abstractObject.surrounding.obstacle.AbstractObstacle;

import java.util.ArrayList;
import java.util.List;

public class Drawable {
    private static List<AbstractCollidable> enivornmentObjects = new ArrayList<AbstractCollidable>();

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

    public static synchronized List<AbstractCollidable> getEnivornmentObjects() {
        createInstance();
        return enivornmentObjects;
    }

}









