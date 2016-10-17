package game.object.sprite;

import game.object.common.AbstractCollidable;

/**
 * Created by kalafioras on 2016-10-17.
 */
public abstract class AbstractSprite extends AbstractCollidable implements ISprite{
    protected int spriteWidth;
    protected int spriteHeight;

//TODO Rename getters
    public int width() {
        return spriteWidth;
    }


    public int height() {
        return spriteHeight;
    }

}
