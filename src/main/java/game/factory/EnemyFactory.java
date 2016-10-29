package game.factory;

import game.object.enemy.AbstractEnemy;
import game.object.enemy.EnemyType;
import game.object.weapon.AbstractWeapon;
import game.object.weapon.WeaponType;

public class EnemyFactory extends AbstractDrawableFactory  {

    AbstractEnemy getAbstractEnemy(EnemyType enemyType) {
        switch (enemyType){
            case PHEONIX:
                System.out.println("Pheonix");
                break;
            case ZOMBIE:
                System.out.println("Zombie");
                break;
        }
        return null;
    }AbstractWeapon getAbstractWeapon(WeaponType weaponType) {
        return null;
    }

    AbstractWeapon getAbstractWeapon(WeaponType weaponType) {
        return null;
    }
}
