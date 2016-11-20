package game.algorithm.panel;

import com.badlogic.gdx.Gdx;
import game.algorithm.IAlgorithm;
import game.environment.abstractObject.common.AbstractCollidable;

public class Shop implements IAlgorithm {
    public void move(AbstractCollidable object) {
        if(Gdx.input.getX() > object.getX() && Gdx.input.getX() < object.getX() + object.getSprite().getWidth() &&
                Gdx.input.getY() > object.getY() && Gdx.input.getY() < object.getY() + object.getSprite().getHeight()){
            System.out.println(true);
        }
    }
}
