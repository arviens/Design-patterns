package game.environment.object.enemy;

import game.algorithm.enemy.FollowPlayer;
import game.algorithm.item.MoveRandom;
import game.command.ICommand;
import game.command.enemy.EnemyControl;
import game.environment.abstractObject.enemy.AbstractEnemy;
import game.observer.Commander;

public class SnailEnemy extends AbstractEnemy {
    private final static String SNAIL_SPRITE = "src/main/resources/assets/sprites/enemies/snail.png";

    public SnailEnemy(Commander commander) {
        super(commander);
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

    public void update(ICommand cmd) {
        EnemyControl enemyControl = new EnemyControl(cmd);
        enemyControl.action();
    }
    @Override
    public boolean isNull()
    {
        return false;
    }
}
