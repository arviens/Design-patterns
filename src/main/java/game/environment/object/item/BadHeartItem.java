package game.environment.object.item;

import game.algorithm.enemy.FollowPlayer;
import game.environment.abstractObject.item.AbstractItem;


public class BadHeartItem extends AbstractItem {
    private final static String HEART_BAD_SPRITE = "src/main/resources/assets/sprites/items/heartBlack.png";

    public BadHeartItem() {
        setSprite(getSpriteByName(HEART_BAD_SPRITE));
        setName("Heart Bad");

        setEnhancement(Enhancement.HEALTH);
        setPrice(256);
    }
    @Override
    public boolean isNull()
    {
        return false;
    }
}
