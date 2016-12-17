package game.algorithm.item;


import game.algorithm.IAlgorithm;
import game.environment.abstractObject.common.AbstractCollidable;

import java.util.Random;

public class MoveRandom implements IAlgorithm {
    public void move(AbstractCollidable object) {
        object.setY(object.getY() + 15);
    }

}
