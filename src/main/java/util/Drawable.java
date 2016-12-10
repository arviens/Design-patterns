package util;

import game.environment.abstractObject.common.AbstractCollidable;
import game.environment.abstractObject.item.AbstractItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Drawable {
    private static Map<DrawableType, List<AbstractCollidable>> environmentObjects = new HashMap<DrawableType, List<AbstractCollidable>>();

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

    public static synchronized Map<DrawableType, List<AbstractCollidable>> getEnvironmentObjects() {
        createInstance();
        return environmentObjects;
    }

    public static synchronized void addToMap(DrawableType key, AbstractCollidable object) {
        createInstance();
        if (environmentObjects.containsKey(key)) {
            environmentObjects.get(key).add(object);
        } else {
            List<AbstractCollidable> tempList = new ArrayList<AbstractCollidable>();
            tempList.add(object);
            environmentObjects.put(key, tempList);
        }
    }

    public static synchronized List<AbstractCollidable> getByType(DrawableType type) {
        if (environmentObjects.containsKey(type)) {
            return environmentObjects.get(type);
        }
        return new ArrayList<AbstractCollidable>();
    }

}









