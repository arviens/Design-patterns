package game.environment.object.item;

import game.algorithm.enemy.FollowPlayer;
import game.algorithm.item.MoveRandom;
import game.environment.abstractObject.item.AbstractItem;


public class HeartItem extends AbstractItem {
    private final static String HEART_SPRITE = "src/main/resources/assets/sprites/items/heartFull.png";
    private final static String HEART_BAD_SPRITE = "src/main/resources/assets/sprites/items/heartBlack.png";

    public HeartItem(ItemType type) {
        setName("Heart");
        if (type == ItemType.HEART) {
            setSprite(getSpriteByName(HEART_SPRITE));
        } else if (type == ItemType.HEART_BAD) {
            setSprite(getSpriteByName(HEART_BAD_SPRITE));
            setName("Heart Bad");
        } else {
            setSprite(getSpriteByName(HEART_SPRITE));
        }
        setEnhancement(Enhancement.HEALTH);
        setPrice(256);
        setAlgorithm(new FollowPlayer());
    }
}
