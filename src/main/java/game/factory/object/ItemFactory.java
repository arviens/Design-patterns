package game.factory.object;

import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.weapon.AbstractWeapon;
import game.environment.object.item.*;
import game.environment.object.weapon.WeaponType;

public class ItemFactory extends AbstractObjectFactory {

    public AbstractItem getAbstractItem(ItemType itemType) {
        switch (itemType) {
            case HEART:
                return new HeartItem();
            case HEART_BAD:
                return new BadHeartItem();
            case SHROOM:
                return new ShroomItem();
            case SHROOM_BAD:
                return new BadShroomItem();
            case BLUE_GEM:
                return new BlueGemItem();
            case COIN:
                return new CoinItem();
            case GREEN_GEM:
                return new GreenGemItem();
            case RED_GEM:
                return new RedGemItem();
            case YELLOW_GEM:
                return new YellowGemItem();
            default:
                return new NullItem();
        }
    }

    public AbstractWeapon getAbstractWeapon(WeaponType weaponType) {
        return null;
    }
}
