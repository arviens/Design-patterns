package game.environment.object.item;

import game.environment.abstractObject.item.AbstractItem;
import game.factory.SpriteFactory;

public class BadHeartItem extends AbstractItem {
    private final static String HEART_BAD_SPRITE = "src/main/resources/assets/sprites/items/heartBlack.png";

    public BadHeartItem() {
        setSprite(SpriteFactory.getSprite(HEART_BAD_SPRITE));
        setName("Heart Bad");

        setEnhancement(Enhancement.HEALTH);
        setPrice(256);
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
