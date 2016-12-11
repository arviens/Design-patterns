package game.factory.object;

import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.weapon.AbstractWeapon;
import game.environment.object.item.*;
import game.environment.object.weapon.WeaponType;

public class ItemFactory extends AbstractObjectFactory {

    public AbstractItem getAbstractItem(ItemType itemType) {
        AbstractItem abstractItem = null;
        switch (itemType) {
            case HEART:
                abstractItem = new HeartItem();
                break;
            case HEART_BAD:
                abstractItem = new BadHeartItem();
                break;
            case SHROOM:
                abstractItem = new ShroomItem();
                break;
            case SHROOM_BAD:
                abstractItem = new BadShroomItem();
                break;
            case BLUE_GEM:
                abstractItem = new BlueGemItem();
                break;
            case COIN:
                abstractItem = new CoinItem();
                break;
            case GREEN_GEM:
                abstractItem = new GreenGemItem();
                break;
            case RED_GEM:
                abstractItem = new RedGemItem();
                break;
            case YELLOW_GEM:
                abstractItem = new YellowGemItem();
                break;
        }

        return abstractItem;
    }

    public AbstractWeapon getAbstractWeapon(WeaponType weaponType) {
        return null;
    }
}
