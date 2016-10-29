package game.factory;

import game.object.enemy.AbstractEnemy;
import game.object.enemy.EnemyType;
import game.object.weapon.AbstractWeapon;
import game.object.weapon.WeaponType;

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
    }AbstractWeapon getAbstractWeapon(WeaponType weaponType) {
        return null;
    }
}
