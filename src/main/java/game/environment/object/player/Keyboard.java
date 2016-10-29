package game.environment.object.player;

import com.badlogic.gdx.Input.Keys;

/**
 * Stores with which keyboard keys player will move
 */
public class Keyboard {
    private Keys left;
    private Keys right;
    private Keys jump;

    public Keyboard() {
    }

    public Keys getLeft() {
        return left;
    }

    public void setLeft(Keys left) {
        this.left = left;
    }

    public Keys getRight() {
        return right;
    }

    public void setRight(Keys right) {
        this.right = right;
    }

    public Keys getJump() {
        return jump;
    }

    public void setJump(Keys jump) {
        this.jump = jump;
    }
}
