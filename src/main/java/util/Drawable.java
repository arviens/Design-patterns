package util;

import game.environment.abstractObject.common.AbstractCollidable;
import game.environment.abstractObject.enemy.AbstractEnemy;
import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.player.AbstractPlayer;
import game.environment.abstractObject.surrounding.platform.AbstractPlatform;
import game.environment.abstractObject.weapon.AbstractWeapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Drawable {
    private static Map<DrawableType, List<AbstractCollidable>> environmentObjects = new HashMap<DrawableType, List<AbstractCollidable>>();

    private static DrawableAction lists;

    private static Drawable instance;

    public static synchronized Drawable getInstance() {
        createInstance();
        return instance;
    }

    private static synchronized void createInstance() {
        if (instance == null) {
            lists = new DrawableAction();
            instance = new Drawable();
        }
    }

    public static synchronized Map<DrawableType, List<AbstractCollidable>> getEnvironmentObjects() {
        createInstance();
        return environmentObjects;
    }

    public static synchronized void addToMap(DrawableType key, Object object) {
        createInstance();
        if (environmentObjects.containsKey(key)) {
            environmentObjects.get(key).add((AbstractCollidable) object);
        } else {
            List<AbstractCollidable> tempList = new ArrayList<AbstractCollidable>();
            tempList.add((AbstractCollidable) object);
            environmentObjects.put(key, tempList);
        }

        addToLists(key, object);
    }

    public static synchronized List<AbstractCollidable> getByType(DrawableType type) {
        if (environmentObjects.containsKey(type)) {
            return environmentObjects.get(type);
        }
        return new ArrayList<AbstractCollidable>();
    }

    public static synchronized DrawableAction getLists() {
        return lists;
    }

    private static synchronized void addToLists(DrawableType type, Object object) {
        switch (type) {
            case PLATFORM:
                lists.addPlatform((AbstractPlatform) object);
                break;
            case ENEMY:
                lists.addEnemy((AbstractEnemy) object);
                break;
            case PLAYER:
                lists.addPlayer((AbstractPlayer) object);
                break;
            case ITEM:
                lists.addItem((AbstractItem) object);
                break;
            case WEAPON:
                lists.addWeapon((AbstractWeapon) object);
                break;
        }
    }
}









