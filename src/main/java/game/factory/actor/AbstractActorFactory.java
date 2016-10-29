package game.factory.actor;

import game.environment.abstractObject.enemy.AbstractEnemy;
import game.environment.object.enemy.EnemyType;

/**
 * Creates enemies by its type
 */
abstract class AbstractActorFactory {
    abstract AbstractEnemy getAbstractEnemy(EnemyType enemyType);
}
