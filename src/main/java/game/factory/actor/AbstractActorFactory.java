package game.factory.actor;

import game.environment.abstractObject.enemy.AbstractEnemy;

/**
 * Creates enemies by its type
 */
abstract class AbstractActorFactory {
    abstract AbstractEnemy getAbstractEnemy(EnemyType enemyType);
}
