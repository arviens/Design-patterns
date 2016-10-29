package game.factory;

import game.environment.enemy.AbstractEnemy;
import game.environment.enemy.EnemyType;

/**
 * Creates enemies by its type
 */
abstract class AbstractActorFactory {
    abstract AbstractEnemy getAbstractEnemy(EnemyType enemyType);
}
