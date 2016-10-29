package game.environment.abstractObject.common;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import game.algorithm.AbstractAlgorithm;

/**
 * Abstracts class used for store surrounding position
 */
public abstract class AbstractCollidable {
    private int x;
    private int y;
    private Sprite sprite;
    private AbstractAlgorithm abstractAlgorithm;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public static Sprite getSpriteByName(String pathToSprite) {
        return new Sprite(new Texture(new FileHandle(pathToSprite)));
    }

    public AbstractAlgorithm getAbstractAlgorithm() {
        return abstractAlgorithm;
    }

    public void setAbstractAlgorithm(AbstractAlgorithm abstractAlgorithm) {
        this.abstractAlgorithm = abstractAlgorithm;
    }
}
