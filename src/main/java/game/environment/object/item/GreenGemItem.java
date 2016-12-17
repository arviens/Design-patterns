package game.environment.object.item;

import game.environment.abstractObject.item.AbstractItem;
import game.factory.SpriteFactory;

public class GreenGemItem extends AbstractItem {
    private final static String GREEN_GEM_SPRITE = "src/main/resources/assets/sprites/items/gemGreen.png";

    public GreenGemItem() {
        setSprite(SpriteFactory.getSprite(GREEN_GEM_SPRITE));
        setName("Green gem");

        setEnhancement(Enhancement.HEALTH);
        setPrice(256);
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
