package game.algorithm.enemy;

import game.algorithm.Algorithm;
import game.environment.abstractObject.common.AbstractCollidable;

public class SimpleMove implements Algorithm{

    public void move(AbstractCollidable object) {
        object.setX(object.getX() + 1);
        object.setY(object.getY() + 1);
    }
}
