package game.environment.object.weapon;

import game.environment.abstractObject.weapon.AbstractWeapon;

/**
 * Created by kalafioras on 2016-12-17.
 */
public class PistolWeapon extends AbstractWeapon {
    private final static String WEAPON_SPRITE = "src/main/resources/assets/sprites/items/heartBlack.png";

    public PistolWeapon() {
        setSprite(getSpriteByName(WEAPON_SPRITE));
        setName("Pistol weapon");

        setPrice(256);
    }
    @Override
    public boolean isNull()
    {
        return false;
    }
}
