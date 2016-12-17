package game.algorithm.item;


import game.algorithm.IAlgorithm;
import game.environment.abstractObject.common.AbstractCollidable;

import java.util.Random;

public class MoveRandom implements IAlgorithm {
    public void move(AbstractCollidable object) {
//        object.setY(object.getY());
        System.out.println(object.getX());
        System.out.println(object.getY());
    }

}
