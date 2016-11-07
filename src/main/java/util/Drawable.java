package util;

import game.environment.abstractObject.common.AbstractCollidable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Drawable {
    private static Map<DrawableType, List<AbstractCollidable>> enivornmentObjects = new HashMap<DrawableType, List<AbstractCollidable>>();

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

    public static synchronized Map<DrawableType, List<AbstractCollidable>> getEnivornmentObjects() {
        createInstance();
        return enivornmentObjects;
    }

    public static synchronized void addToMap(DrawableType key, AbstractCollidable object) {
        createInstance();
        if (enivornmentObjects.containsKey(key)) {
            enivornmentObjects.get(key).add(object);
        } else {
            List<AbstractCollidable> tempList = new ArrayList<AbstractCollidable>();
            tempList.add(object);
            enivornmentObjects.put(key, tempList);
        }
    }

    public static synchronized List<AbstractCollidable> getByType(DrawableType type) {
        if (enivornmentObjects.containsKey(type)) {
            return enivornmentObjects.get(type);
        }
        return null;
    }

}









