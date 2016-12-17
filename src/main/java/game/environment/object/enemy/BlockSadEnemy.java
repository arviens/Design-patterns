package game.environment.object.enemy;

import game.algorithm.enemy.FollowPlayer;
import game.algorithm.item.MoveRandom;
import game.command.ICommand;
import game.command.enemy.EnemyControl;
import game.environment.abstractObject.enemy.AbstractEnemy;
import game.factory.SpriteFactory;
import game.observer.Commander;

public class BlockSadEnemy extends AbstractEnemy {
    private final static String BLOCK_SAD_SPRITE = "src/main/resources/assets/sprites/enemies/blockerSad.png";

    public BlockSadEnemy(Commander commander) {
        super(commander);
        setSprite(SpriteFactory.getSprite(BLOCK_SAD_SPRITE));
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
    public boolean isNull() {
        return false;
    }
}
