package game.environment.object.player;

import game.algorithm.player.PlayerMove;
import game.environment.abstractObject.player.AbstractPlayer;
import game.factory.SpriteFactory;


public class Player extends AbstractPlayer {
    private final static String PLAYER_SPRITE = "src/main/resources/assets/images/batman.png";

    public Player() {
        setSprite(SpriteFactory.getSprite(PLAYER_SPRITE));
        setAlgorithm(new PlayerMove());
        movingBody();
    }

    public boolean isNull() {
        return false;
    }
}
