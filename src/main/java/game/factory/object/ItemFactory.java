package game.factory.object;

import game.environment.item.AbstractItem;
import game.environment.item.ItemType;
import game.environment.weapon.AbstractWeapon;
import game.environment.weapon.WeaponType;

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
