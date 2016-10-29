package game.environment.abstractObject.weapon;

import game.environment.abstractObject.common.AbstractCollidable;
import game.sound.AbstractSound;

/**
 * Stores information about weapon
 */
public abstract class AbstractWeapon extends AbstractCollidable {
    private AbstractSound shootingSound;
    private AbstractSound pickUpSound;
    private int damage;

    public AbstractSound getShootingSound() {
        return shootingSound;
    }

    public void setShootingSound(AbstractSound shootingSound) {
        this.shootingSound = shootingSound;
    }

    public AbstractSound getPickUpSound() {
        return pickUpSound;
    }

    public void setPickUpSound(AbstractSound pickUpSound) {
        this.pickUpSound = pickUpSound;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
