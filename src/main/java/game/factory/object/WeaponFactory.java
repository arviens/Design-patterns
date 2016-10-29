package game.factory.object;

import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.weapon.AbstractWeapon;
import game.environment.object.item.ItemType;
import game.environment.object.weapon.WeaponType;

public class WeaponFactory extends AbstractObjectFactory {

    AbstractItem getAbstractItem(ItemType itemType) {
        return null;
    }

    AbstractWeapon getAbstractWeapon(WeaponType weaponType) {
        return null;
    }
}
