package game.environment.object.item;

import game.algorithm.enemy.SimpleMove;
import game.environment.abstractObject.item.AbstractItem;


public class HeartItem extends AbstractItem {
    private final static String HEART_SPRITE = "src/main/resources/assets/sprites/enemies/blockerMad.png";

    public HeartItem() {
        setSprite(getSpriteByName(HEART_SPRITE));
        setAlgorithm(new SimpleMove());
    }

}
