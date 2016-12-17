package game.environment.object.enemy;

import game.algorithm.enemy.FollowPlayer;
import game.algorithm.item.MoveRandom;
import game.command.ICommand;
import game.command.enemy.EnemyControl;
import game.command.enemy.zombie.ZombieFlee;
import game.environment.abstractObject.enemy.AbstractEnemy;
import game.observer.Commander;
import util.Drawable;

public class BlockMadEnemy extends AbstractEnemy {
    private final static String BLOCK_MAD_SPRITE = "src/main/resources/assets/sprites/enemies/blockerMad.png";

    public BlockMadEnemy(Commander commander) {
        super(commander);
        setSprite(getSpriteByName(BLOCK_MAD_SPRITE));
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
            cmd.setEnemy(this);
            EnemyControl enemyControl = new EnemyControl(cmd);
            enemyControl.action();
    }
    @Override
    public boolean isNull()
    {
        return false;
    }
}
