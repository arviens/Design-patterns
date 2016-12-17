package game.environment.object.weapon;

import game.environment.abstractObject.weapon.AbstractWeapon;
import game.environment.object.item.Enhancement;

import static game.environment.abstractObject.common.AbstractCollidable.getSpriteByName;

/**
 * Created by kalafioras on 2016-12-17.
 */
public class PistolWeapon extends AbstractWeapon {
    private final static String HEART_BAD_SPRITE = "src/main/resources/assets/sprites/items/heartBlack.png";

    public PistolWeapon() {
        setSprite(getSpriteByName(HEART_BAD_SPRITE));
        setName("Heart Bad");

        setPrice(256);
    }
    @Override
    public boolean isNull()
    {
        return false;
    }
}
