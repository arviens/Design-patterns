package game.environment.abstractObject.common;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import game.algorithm.Algorithm;

/**
 * Abstracts class used for store surrounding position
 */
public abstract class AbstractCollidable {
    private int x;
    private int y;
    private Sprite sprite;
    private Algorithm abstractAlgorithm;

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

    public Algorithm getAlgorithm() {
        return abstractAlgorithm;
    }

    public void move(){
        if(abstractAlgorithm != null) {
            abstractAlgorithm.move(this);
        }
    }

    public void setAlgorithm(Algorithm abstractAlgorithm) {
        this.abstractAlgorithm = abstractAlgorithm;
    }
}
