package game.environment.object.item;

import game.environment.abstractObject.item.AbstractItem;

public class ShroomItem extends AbstractItem {
    private final static String MUSHROOM_BROWN_SPRITE = "src/main/resources/assets/sprites/items/mushroomBrown.png";

    public ShroomItem() {
        setName("Shroom");
        setSprite(getSpriteByName(MUSHROOM_BROWN_SPRITE));
        setPrice(123);
        setEnhancement(Enhancement.HEALTH);
    }
    @Override
    public boolean isNull()
    {
        return false;
    }
}
