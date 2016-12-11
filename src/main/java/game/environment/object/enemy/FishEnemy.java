package game.environment.object.enemy;

import game.algorithm.enemy.FollowPlayer;
import game.algorithm.item.MoveRandom;
import game.environment.abstractObject.enemy.AbstractEnemy;

public class FishEnemy extends AbstractEnemy {
    private final static String FISH_SPRITE = "src/main/resources/assets/sprites/enemies/fish.png";

    public FishEnemy() {
        setSprite(getSpriteByName(FISH_SPRITE));
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
