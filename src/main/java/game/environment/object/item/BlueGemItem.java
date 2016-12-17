package game.environment.object.item;

import game.environment.abstractObject.item.AbstractItem;


public class BlueGemItem extends AbstractItem {
    private final static String BLUE_GEM_SPRITE = "src/main/resources/assets/sprites/items/gemBlue.png";

    public BlueGemItem() {
        setSprite(getSpriteByName(BLUE_GEM_SPRITE));
        setName("Blue gem");

        setEnhancement(Enhancement.HEALTH);
        setPrice(256);
    }
    @Override
    public boolean isNull()
    {
        return false;
    }
}
