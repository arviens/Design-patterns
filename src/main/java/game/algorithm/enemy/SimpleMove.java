package game.algorithm.enemy;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import game.algorithm.Algorithm;
import game.environment.abstractObject.common.AbstractCollidable;

public class SimpleMove extends AbstractCollidable implements Algorithm{

    public void move(AbstractCollidable object) {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) object.setX(object.getX() - (int)(400 * Gdx.graphics.getDeltaTime()));
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))object.setX(object.getX() + (int)(400 * Gdx.graphics.getDeltaTime()));
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) object.setY(object.getY() + (int)(400 * Gdx.graphics.getDeltaTime()));
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) object.setY(object.getY() - (int)(400 * Gdx.graphics.getDeltaTime()));
    }
}
