package game.factory;

import game.object.enemy.AbstractEnemy;
import game.object.enemy.EnemyType;
import game.object.item.AbstractItem;
import game.object.item.ItemType;
import game.object.weapon.AbstractWeapon;
import game.object.weapon.WeaponType;

abstract class AbstractObjectFactory {
    abstract AbstractItem getAbstractItem(ItemType enemyType);
    abstract AbstractWeapon getAbstractWeapon(WeaponType weaponType);

}
