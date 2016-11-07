package game.algorithm.enemy;

import game.algorithm.Algorithm;
import game.environment.abstractObject.common.AbstractCollidable;
import util.Drawable;
import util.DrawableType;


public class SimpleMove extends AbstractCollidable implements Algorithm{

    public void move(AbstractCollidable object) {
        AbstractCollidable player = Drawable.getByType(DrawableType.PLAYER).get(0);
        object.setX(object.getX() - (object.getX() - player.getX()) / 20);
        object.setY(object.getY() - (object.getY() - player.getY()) / 20);
    }
}
