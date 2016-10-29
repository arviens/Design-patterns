package game.algorithm.enemy;

import game.algorithm.AbstractAlgorithm;
import game.environment.abstractObject.common.AbstractCollidable;

public class SimpleMove extends AbstractAlgorithm {

    public void move(AbstractCollidable object) {
        object.setX(object.getX() + 1);
        object.setY(object.getY() + 1);
    }
}
