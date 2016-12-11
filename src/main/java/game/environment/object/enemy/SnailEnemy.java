package game.environment.object.enemy;

import game.algorithm.enemy.FollowPlayer;
import game.algorithm.item.MoveRandom;
import game.environment.abstractObject.enemy.AbstractEnemy;

public class SnailEnemy extends AbstractEnemy {
    private final static String SNAIL_SPRITE = "src/main/resources/assets/sprites/enemies/snail.png";

    public SnailEnemy() {
        setSprite(getSpriteByName(SNAIL_SPRITE));
    }

    public void attack() {
        setAlgorithm(new FollowPlayer());
    }

    public void flee() {
        setAlgorithm(new MoveRandom());
    }

    public void follow() {

    }
}
