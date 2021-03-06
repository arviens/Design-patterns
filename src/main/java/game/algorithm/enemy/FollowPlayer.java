package game.algorithm.enemy;

import game.algorithm.IAlgorithm;
import com.badlogic.gdx.Gdx;
import game.environment.abstractObject.common.AbstractCollidable;
import util.Drawable;
import util.DrawableType;

import java.util.Random;


public class FollowPlayer implements IAlgorithm {
    public void move(AbstractCollidable object) {
        AbstractCollidable player = Drawable.getByType(DrawableType.PLAYER).get(0);
        int deltaX = object.getX() - player.getX();
        int deltaY = object.getY() - player.getY();

        float ratioX, ratioY;
        if (Math.abs(deltaX) <= 2 && Math.abs(deltaY) <= 2) {
            ratioX = (float) 0;
            ratioY = (float) 0;
        } else {
            ratioX = Math.abs((float) deltaX / (float) ((Math.abs(deltaX) + Math.abs(deltaY))));
            ratioY = Math.abs((float) deltaY / (float) ((Math.abs(deltaX) + Math.abs(deltaY))));
        }
        int speed = 333;
        if (deltaX > 0) {
            object.setX(object.getX() - Math.round(speed * Gdx.graphics.getDeltaTime() * ratioX));
        }
        if ((deltaX) < 0) {
            object.setX(object.getX() + Math.round(speed * Gdx.graphics.getDeltaTime() * ratioX));
        }
        if (deltaY > 0) {
            object.setY(object.getY() - Math.round(speed * Gdx.graphics.getDeltaTime() * ratioY));
        }
        if (deltaY < 0) {
            object.setY(object.getY() + Math.round(speed * Gdx.graphics.getDeltaTime() * ratioY));
        }
    }

    public boolean isNull() {
        return false;
    }
}
