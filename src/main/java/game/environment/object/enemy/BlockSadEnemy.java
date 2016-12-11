package game.environment.object.enemy;

import game.algorithm.enemy.FollowPlayer;
import game.algorithm.item.MoveRandom;
import game.environment.abstractObject.enemy.AbstractEnemy;

public class BlockSadEnemy extends AbstractEnemy {
    private final static String BLOCK_SAD_SPRITE = "src/main/resources/assets/sprites/enemies/blockerSad.png";

    public BlockSadEnemy() {
        setSprite(getSpriteByName(BLOCK_SAD_SPRITE));
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
