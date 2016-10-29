package game.factory.object;

import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.weapon.AbstractWeapon;

abstract class AbstractObjectFactory {
    abstract AbstractItem getAbstractItem(ItemType itemType);
    abstract AbstractWeapon getAbstractWeapon(WeaponType weaponType);
}
