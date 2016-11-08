package game.environment.object.player;

import game.algorithm.enemy.SimpleMove;
import game.environment.abstractObject.player.AbstractPlayer;


public class Player extends AbstractPlayer {
    private final static String HEART_SPRITE = "src/main/resources/assets/images/gangsta.png";

    public Player() {
        setSprite(getSpriteByName(HEART_SPRITE));
        setAlgorithm(new SimpleMove());
    }
}
