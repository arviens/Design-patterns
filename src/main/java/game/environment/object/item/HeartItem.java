package game.environment.object.item;

import game.environment.abstractObject.item.AbstractItem;

/**
 * Created by kalafioras on 2016-10-29.
 */
public class HeartItem extends AbstractItem {
    private final static String HEART_SPRITE = "/assets/sprites/enemies/blockerMad.png";

    public HeartItem() {
        setSprite(getSpriteByName(HEART_SPRITE));
    }
}
