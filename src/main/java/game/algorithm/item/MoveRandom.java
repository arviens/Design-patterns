package game.algorithm.item;


import game.algorithm.IAlgorithm;
import game.environment.abstractObject.common.AbstractCollidable;

import java.util.Random;

public class MoveRandom extends AbstractCollidable implements IAlgorithm {
    public void move(AbstractCollidable object) {
        object.setX(getX() + (new Random().nextInt(5) - 3));
        object.setY(getY() + (new Random().nextInt(5) - 3));
    }
}
