package game.environment.object.weapon;

import game.algorithm.item.MoveRandom;
import game.environment.abstractObject.weapon.AbstractWeapon;

public class BananaWeapon extends AbstractWeapon {
    private final static String BANANA_SPRITE = "src/main/resources/assets/sprites/items/banana.png";

    public BananaWeapon() {
        setSprite(getSpriteByName(BANANA_SPRITE));
        setName("Banana");
        setAlgorithm(new MoveRandom());
        setPrice(132);
    }

    public boolean isNull() {
        return false;
    }
}
