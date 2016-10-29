package game.factory;

import game.object.enemy.AbstractEnemy;
import game.object.enemy.EnemyType;

/**
 * Created by arviens on 10/27/16.
 */
public class EnemyFactory extends AbstractDrawableFactory  {

    AbstractEnemy getAbstractEnemy(EnemyType enemyType) {
        switch (enemyType){
            case MASINA:
                System.out.println("Masina");
                break;
            case BARAVYKAS:
                System.out.println("Baravykas");
                break;
        }
        return null;
    }
}
