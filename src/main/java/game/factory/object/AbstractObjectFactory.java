package game.factory.object;

import game.environment.item.AbstractItem;
import game.environment.item.ItemType;
import game.environment.weapon.AbstractWeapon;
import game.environment.weapon.WeaponType;

abstract class AbstractObjectFactory {
    abstract AbstractItem getAbstractItem(ItemType itemType);
    abstract AbstractWeapon getAbstractWeapon(WeaponType weaponType);
}
