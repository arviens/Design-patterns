package game.environment.object.item;

import game.environment.abstractObject.item.AbstractItem;

public class HeartItem extends AbstractItem {
    private final static String HEART_SPRITE = "src/main/resources/assets/sprites/items/heartFull.png";

    public HeartItem() {
        setName("Heart");

        setSprite(getSpriteByName(HEART_SPRITE));
        setEnhancement(Enhancement.HEALTH);
        setPrice(256);
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
