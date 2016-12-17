package game.factory.actor;

import game.environment.abstractObject.enemy.AbstractEnemy;
import game.environment.object.enemy.*;
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
        switch (enemyType) {
            case BLOCK_MAD:
                return new BlockMadEnemy(commander);
            case BLOCK_SAD:
                return new BlockSadEnemy(commander);
            case FISH:
                return new FishEnemy(commander);
            case SNAIL:
                return new FishEnemy(commander);
            default:
                return new NullEnemy(commander);
        }
    }
}
