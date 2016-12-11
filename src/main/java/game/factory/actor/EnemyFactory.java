package game.factory.actor;

import game.environment.abstractObject.enemy.AbstractEnemy;
import game.environment.object.enemy.BlockSadEnemy;
import game.environment.object.enemy.EnemyType;
import game.environment.object.enemy.BlockMadEnemy;
import game.environment.object.enemy.FishEnemy;

/**
 * Enemy factory used for creating enemies
 */
public class EnemyFactory extends AbstractActorFactory {

    AbstractEnemy getAbstractEnemy(EnemyType enemyType) {
        AbstractEnemy enemy = null;
        switch (enemyType) {
            case BLOCK_MAD:
                enemy = new BlockMadEnemy();
                break;
            case BLOCK_SAD:
                enemy = new BlockSadEnemy();
                break;
            case FISH:
                enemy = new FishEnemy();
                break;
            case SNAIL:
                enemy = new FishEnemy();
                break;
        }
        return enemy;
    }
}
