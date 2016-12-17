package game.factory.object;

import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.weapon.AbstractWeapon;
import game.environment.object.item.*;
import game.environment.object.weapon.PistolWeapon;
import game.environment.object.weapon.WeaponType;

public class WeaponFactory extends AbstractObjectFactory {

    public AbstractItem getAbstractItem(ItemType itemType) {
        return null;
    }

    public AbstractWeapon getAbstractWeapon(WeaponType weaponType) {
        //TODO Null object dp
        switch (weaponType) {
            case BANANA:
                return new BananaWeapon();
            case PISTOL:
                return new PistolWeapon();
            case BUMERANG:
                return new BumerangWeapon();

        }
        return null;
    }
}
