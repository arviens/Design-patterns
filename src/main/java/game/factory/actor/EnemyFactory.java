package game.factory.actor;

import game.environment.abstractObject.enemy.AbstractEnemy;
import game.environment.object.enemy.BlockSadEnemy;
import game.environment.object.enemy.EnemyType;
import game.environment.object.enemy.BlockMadEnemy;
import game.environment.object.enemy.FishEnemy;
import game.observer.Commander;

/**
 * Enemy factory used for creating enemies
 */
public class EnemyFactory extends AbstractActorFactory {

    private Commander commander;
    public EnemyFactory(Commander commander)
    {
        this.commander  = commander;
    }

    public AbstractEnemy getAbstractEnemy(EnemyType enemyType) {
        AbstractEnemy enemy = null;
        switch (enemyType) {
            case BLOCK_MAD:
                enemy = new BlockMadEnemy(commander);
                break;
            case BLOCK_SAD:
                enemy = new BlockSadEnemy(commander);
                break;
            case FISH:
                enemy = new FishEnemy(commander);
                break;
            case SNAIL:
                enemy = new FishEnemy(commander);
                break;
        }
        return enemy;
    }
}
