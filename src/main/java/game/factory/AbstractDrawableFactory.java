package game.factory;

import game.object.enemy.AbstractEnemy;
import game.object.enemy.EnemyType;
import game.object.weapon.AbstractWeapon;
import game.object.weapon.WeaponType;

abstract class AbstractDrawableFactory {
    abstract AbstractEnemy getAbstractEnemy(EnemyType enemyType);
    abstract AbstractWeapon getAbstractWeapon(WeaponType weaponType);
}
