package game.environment.abstractObject.weapon;

import game.environment.abstractObject.common.AbstractCollidable;
import game.environment.object.item.Enhancement;
import game.sound.AbstractSound;

/**
 * Stores information about weapon
 */
public abstract class AbstractWeapon extends AbstractCollidable {
    private AbstractSound shootingSound;
    private int damage;
    private long droppedTime;
    //What kind of enhancement actor will give to user
    private Enhancement enhancement;
    //What kind of influence
    private int influence;
    private AbstractSound pickUpSound;
    private String name;

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

    public long getDroppedTime() {
        return droppedTime;
    }

    public void setDroppedTime(long droppedTime) {
        this.droppedTime = droppedTime;
    }

    public int getInfluence() {
        return influence;
    }

    public void setInfluence(int influence) {
        this.influence = influence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
