package game.factory.object;

import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.weapon.AbstractWeapon;

public class ItemFactory extends AbstractObjectFactory {

    AbstractItem getAbstractItem(ItemType itemType) {
        switch (itemType) {
            case HEART:
                System.out.println("Heart");
                break;
            case SHROOM:
                System.out.println("Shroom");
                break;
        }
        return null;
    }

    AbstractWeapon getAbstractWeapon(WeaponType weaponType) {
        return null;
    }
}
