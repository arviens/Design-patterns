package game.environment.object.enemy;

import game.algorithm.enemy.FollowPlayer;
import game.algorithm.item.MoveRandom;
import game.environment.abstractObject.enemy.AbstractEnemy;

public class ZombieEnemy extends AbstractEnemy {
    private final static String ZOMBIE_SPRITE = "src/main/resources/assets/sprites/enemies/blockerMad.png";

    public ZombieEnemy() {
        setSprite(getSpriteByName(ZOMBIE_SPRITE));
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
