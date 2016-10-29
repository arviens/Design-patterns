package util;

import game.environment.abstractObject.common.AbstractCollidable;

import java.util.ArrayList;
import java.util.List;

public class Drawable {
    private static List<AbstractCollidable> surroundingObjects = new ArrayList<AbstractCollidable>();
    private static List<AbstractCollidable> itemObjects = new ArrayList<AbstractCollidable>();
    private static List<AbstractCollidable> enemyObjects = new ArrayList<AbstractCollidable>();


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

    public static synchronized List<AbstractCollidable> getSurroundingObjects() {
        createInstance();
        return surroundingObjects;
    }

    public static synchronized List<AbstractCollidable> getItemObjects() {
        createInstance();
        return itemObjects;
    }

    public static synchronized List<AbstractCollidable> getEnemyObjects() {
        createInstance();
        return enemyObjects;
    }
}









