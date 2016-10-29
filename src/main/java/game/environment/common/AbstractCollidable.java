package game.environment.common;

/**
 * Abstracts class used for store surrounding position
 */
public abstract class AbstractCollidable {
    public int x;
    public int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
