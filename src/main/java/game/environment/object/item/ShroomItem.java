package game.environment.object.item;

import game.environment.abstractObject.item.AbstractItem;

public class ShroomItem extends AbstractItem {
    private final static String MUSHROOM_BROWN_SPRITE = "src/main/resources/assets/sprites/items/mushroomBrown.png";
    private final static String MUSHROOM_RED_SPRITE = "src/main/resources/assets/sprites/items/mushroomRed.png";

    public ShroomItem(ItemType type) {
        if (type == ItemType.SHROOM) {
            setSprite(getSpriteByName(MUSHROOM_BROWN_SPRITE));
        } else if (type == ItemType.SHROOM_BAD) {
            setSprite(getSpriteByName(MUSHROOM_RED_SPRITE));
        } else {
            setSprite(getSpriteByName(MUSHROOM_BROWN_SPRITE));
        }

        setEnhancement(Enhancement.HEALTH);
    }
}
