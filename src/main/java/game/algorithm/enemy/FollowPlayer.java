package game.algorithm.enemy;

import com.badlogic.gdx.Gdx;
import game.algorithm.Algorithm;
import game.environment.abstractObject.common.AbstractCollidable;
import util.Drawable;
import util.DrawableType;


public class FollowPlayer extends AbstractCollidable implements Algorithm {
    public void move(AbstractCollidable object) {
        AbstractCollidable player = Drawable.getByType(DrawableType.PLAYER).get(0);

        int deltaX = object.getX() - player.getX();
        int deltaY = object.getY() - player.getY();

        float ratioX, ratioY;
        if(Math.abs(deltaX) <= 1 && Math.abs(deltaY) <= 1)
        {
            ratioX = (float)0;
            ratioY = (float)0;
        }else {
                ratioX = Math.abs((float)deltaX / (float)((Math.abs(deltaX)+Math.abs(deltaY))));
                ratioY = Math.abs((float)deltaY / (float)((Math.abs(deltaX)+Math.abs(deltaY))));
        }

        if(deltaX > 0)
        {
            object.setX(object.getX() - Math.round(350 * Gdx.graphics.getDeltaTime() * ratioX ));
        }
        if((deltaX) < 0)
        {
            object.setX(object.getX() + Math.round(350 * Gdx.graphics.getDeltaTime() * ratioX ));
        }
        if(deltaY > 0)
        {
            object.setY(object.getY() - Math.round(350 * Gdx.graphics.getDeltaTime() * ratioY));
        }
        if( deltaY < 0)
        {
            object.setY(object.getY() + Math.round(350 * Gdx.graphics.getDeltaTime() * ratioY));
        }
    }
}
