package game.factory.object;

import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.weapon.AbstractWeapon;
import game.environment.object.item.HeartItem;
import game.environment.object.item.ItemType;
import game.environment.object.item.ShroomItem;
import game.environment.object.weapon.WeaponType;

public class ItemFactory extends AbstractObjectFactory {

    public AbstractItem getAbstractItem(ItemType itemType) {
        AbstractItem abstractItem = null;
        switch (itemType) {
            case HEART:
            case HEART_BAD:
                abstractItem = new HeartItem(itemType);
                break;
            case SHROOM:
            case SHROOM_BAD:
                abstractItem = new ShroomItem(itemType);
                break;
        }
        return abstractItem;
    }

    public AbstractWeapon getAbstractWeapon(WeaponType weaponType) {
        return null;
    }
}
