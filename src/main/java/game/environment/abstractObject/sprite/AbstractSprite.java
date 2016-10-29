package game.environment.abstractObject.sprite;

import game.environment.abstractObject.common.AbstractCollidable;

/**
 * Created by kalafioras on 2016-10-17.
 */
public abstract class AbstractSprite extends AbstractCollidable implements ISprite{
    private int spriteWidth;
    private int spriteHeight;

    public int getSpriteWidth() {
        return spriteWidth;
    }

    public void setSpriteWidth(int spriteWidth) {
        this.spriteWidth = spriteWidth;
    }

    public int getSpriteHeight() {
        return spriteHeight;
    }

    public void setSpriteHeight(int spriteHeight) {
        this.spriteHeight = spriteHeight;
    }
}
