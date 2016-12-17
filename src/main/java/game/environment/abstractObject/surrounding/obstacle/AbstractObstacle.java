package game.environment.abstractObject.surrounding.obstacle;

import game.environment.abstractObject.common.AbstractCollidable;

/**
 * Not alive object, still or moving without an algorithm, harmful to player
 */
public class AbstractObstacle extends AbstractCollidable {
    public boolean isNull() {
        return false;
    }
}
