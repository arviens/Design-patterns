package game.factory.object;

import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.weapon.AbstractWeapon;
import game.environment.object.item.ItemType;
import game.environment.object.weapon.WeaponType;

public abstract class AbstractObjectFactory {
    public abstract AbstractItem getAbstractItem(ItemType itemType);
    public abstract AbstractWeapon getAbstractWeapon(WeaponType weaponType);
}
