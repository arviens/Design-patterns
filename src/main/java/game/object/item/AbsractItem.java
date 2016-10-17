package game.object.item;

import game.object.common.AbstractCollidable;
import game.sound.AbstractSound;

/**
 * Stores information about item
 */
public abstract class AbsractItem extends AbstractCollidable {
    private long droppedTime;

    //What kind of enhancement item will give to user
    private Enhancement enhancement;

    //What kind of influence
    private int influence;

    private AbstractSound pickUpSound;

}

