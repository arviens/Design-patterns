package game.environment.object.item;

import game.environment.abstractObject.item.AbstractItem;
import game.factory.SpriteFactory;


public class YellowGemItem extends AbstractItem {
    private final static String YELLOW_GEM_SPRITE = "src/main/resources/assets/sprites/items/gemYellow.png";

    public YellowGemItem() {
        setSprite(SpriteFactory.getSprite(YELLOW_GEM_SPRITE));
        setName("Yellow gem");

        setEnhancement(Enhancement.HEALTH);
        setPrice(256);
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
