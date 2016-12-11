package game.environment.object.item;

import game.environment.abstractObject.item.AbstractItem;

public class BadShroomItem extends AbstractItem {
    private final static String MUSHROOM_RED_SPRITE = "src/main/resources/assets/sprites/items/mushroomRed.png";

    public BadShroomItem() {
        setSprite(getSpriteByName(MUSHROOM_RED_SPRITE));
        setName("Shroom Bad");

        setPrice(123);
        setEnhancement(Enhancement.HEALTH);
    }
}
