package game.factory.actor;

import game.environment.abstractObject.enemy.AbstractEnemy;
import game.environment.object.enemy.EnemyType;
import game.environment.object.enemy.ZombieEnemy;

/**
 * Enemy factory used for creating enemies
 */
public class EnemyFactory extends AbstractActorFactory {

    AbstractEnemy getAbstractEnemy(EnemyType enemyType) {
        AbstractEnemy enemy = null;
        switch (enemyType){
            case PHOENIX:
                System.out.println("Pheonix");
                break;
            case ZOMBIE:
                enemy = new ZombieEnemy();
                break;
        }
        return enemy;
    }
}
