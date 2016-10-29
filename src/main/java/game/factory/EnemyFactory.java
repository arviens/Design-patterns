package game.factory;

import game.object.enemy.AbstractEnemy;
import game.object.enemy.EnemyType;

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
