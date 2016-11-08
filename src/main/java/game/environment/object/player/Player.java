package game.environment.object.player;

import game.algorithm.player.PlayerMove;
import game.environment.abstractObject.player.AbstractPlayer;


public class Player extends AbstractPlayer {
    private final static String PLAYER_SPRITE = "src/main/resources/assets/images/gangsta.png";

    public Player() {
        setSprite(getSpriteByName(PLAYER_SPRITE));
        setAlgorithm(new PlayerMove());
    }
}
