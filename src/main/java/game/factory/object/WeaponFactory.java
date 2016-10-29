package game.factory.object;


import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.weapon.AbstractWeapon;

public class WeaponFactory extends AbstractObjectFactory {

    AbstractItem getAbstractItem(ItemType itemType) {
        return null;
    }

    AbstractWeapon getAbstractWeapon(WeaponType weaponType) {
        switch (weaponType){
            case BANANA:
                System.out.println("Banana");
                break;
        }
        return null;
    }
}
