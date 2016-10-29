package game.environment.item;

import game.environment.common.AbstractCollidable;
import game.environment.sprite.AbstractSprite;
import game.sound.AbstractSound;

/**
 * Stores information about item
 */
public abstract class AbstractItem extends AbstractCollidable {
    private long droppedTime;

    //What kind of enhancement item will give to user
    private Enhancement enhancement;

    //What kind of influence
    private int influence;

    private AbstractSound pickUpSound;

    private AbstractSprite sprite;

    public long getDroppedTime() {
        return droppedTime;
    }

    public void setDroppedTime(long droppedTime) {
        this.droppedTime = droppedTime;
    }

    public Enhancement getEnhancement() {
        return enhancement;
    }

    public void setEnhancement(Enhancement enhancement) {
        this.enhancement = enhancement;
    }

    public int getInfluence() {
        return influence;
    }

    public void setInfluence(int influence) {
        this.influence = influence;
    }

    public AbstractSound getPickUpSound() {
        return pickUpSound;
    }

    public void setPickUpSound(AbstractSound pickUpSound) {
        this.pickUpSound = pickUpSound;
    }

    public AbstractSprite getSprite() {
        return sprite;
    }

    public void setSprite(AbstractSprite sprite) {
        this.sprite = sprite;
    }
}

