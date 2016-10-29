package game.factory.object;


import game.environment.item.AbstractItem;
import game.environment.item.ItemType;
import game.environment.weapon.AbstractWeapon;
import game.environment.weapon.WeaponType;

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
