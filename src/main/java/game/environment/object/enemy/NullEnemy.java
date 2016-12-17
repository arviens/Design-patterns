package game.environment.object.enemy;

import game.algorithm.enemy.FollowPlayer;
import game.algorithm.item.MoveRandom;
import game.command.ICommand;
import game.command.enemy.EnemyControl;
import game.environment.abstractObject.enemy.AbstractEnemy;
import game.observer.Commander;

/**
 * Created by kalafioras on 2016-12-17.
 */
public class NullEnemy extends AbstractEnemy {
    private final static String BLOCK_SAD_SPRITE = "src/main/resources/assets/sprites/enemies/blockerSad.png";

    public NullEnemy(Commander commander) {
        super(commander);
    }

    public void update(ICommand cmd) {
        System.out.println("Operation not supported");
    }

    @Override
    public boolean isNull()
    {
        return true;
    }

    public void attack() {
        System.out.println("Operation not suported");
    }

    public void flee() {
        System.out.println("Operation not suported");

    }

    public void follow() {
        System.out.println("Operation not suported");

    }
}
