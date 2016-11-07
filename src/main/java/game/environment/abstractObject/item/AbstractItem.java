package game.environment.abstractObject.item;

import com.badlogic.gdx.graphics.g2d.Sprite;
import game.environment.abstractObject.common.AbstractCollidable;
import game.environment.object.item.Enhancement;
import game.sound.AbstractSound;

/**
 * Stores information about actor
 */
public abstract class AbstractItem extends AbstractCollidable {

    private long droppedTime;
    //What kind of enhancement actor will give to user
    private Enhancement enhancement;
    //What kind of influence
    private int influence;
    private AbstractSound pickUpSound;

    public AbstractItem() {
        droppedTime = System.currentTimeMillis();
    }

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
}