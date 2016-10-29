package game.environment.abstractObject.sprite;

import com.badlogic.gdx.graphics.g2d.Sprite;
import game.environment.abstractObject.common.AbstractCollidable;

/**
 * Created by kalafioras on 2016-10-17.
 */
public abstract class AbstractSprite extends AbstractCollidable {
    private int spriteWidth;
    private int spriteHeight;
    private Sprite sprite;

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

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }
}
