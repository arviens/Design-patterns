package game.environment.object.item;

import game.environment.abstractObject.item.AbstractItem;
import game.factory.SpriteFactory;

public class RedGemItem extends AbstractItem {
    private final static String RED_GEM_SPRITE = "src/main/resources/assets/sprites/items/gemRed.png";

    public RedGemItem() {
        setSprite(SpriteFactory.getSprite(RED_GEM_SPRITE));
        setName("Red gem");

        setEnhancement(Enhancement.HEALTH);
        setPrice(256);
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
