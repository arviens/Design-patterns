package game.factory;

import game.object.enemy.AbstractEnemy;
import game.object.enemy.EnemyType;

/**
 * Creates enemies by its type
 */
abstract class AbstractActorFactory {
    abstract AbstractEnemy getAbstractEnemy(EnemyType enemyType);
}
