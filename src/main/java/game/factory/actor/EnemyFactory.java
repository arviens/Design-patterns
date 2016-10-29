package game.factory.actor;

import game.environment.enemy.AbstractEnemy;
import game.environment.enemy.EnemyType;
import game.factory.actor.AbstractActorFactory;

/**
 * Enemy factory used for creating enemies
 */
public class EnemyFactory extends AbstractActorFactory {

    AbstractEnemy getAbstractEnemy(EnemyType enemyType) {
        switch (enemyType){
            case PHOENIX:
                System.out.println("Pheonix");
                break;
            case ZOMBIE:
                System.out.println("Zombie");
                break;
        }
        return null;
    }
}
