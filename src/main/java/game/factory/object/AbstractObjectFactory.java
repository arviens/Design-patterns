package game.factory.object;

import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.weapon.AbstractWeapon;
import game.environment.object.item.ItemType;
import game.environment.object.weapon.WeaponType;

abstract class AbstractObjectFactory {
    abstract AbstractItem getAbstractItem(ItemType itemType);
    abstract AbstractWeapon getAbstractWeapon(WeaponType weaponType);
}
