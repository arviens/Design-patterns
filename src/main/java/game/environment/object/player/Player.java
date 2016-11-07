package game.environment.object.player;

import game.environment.abstractObject.player.AbstractPlayer;

/**
 * Created by kalafioras on 2016-11-07.
 */
public class Player extends AbstractPlayer {
    private final static String HEART_SPRITE = "src/main/resources/assets/images/gangsta.png";

    public Player() {
        setSprite(getSpriteByName(HEART_SPRITE));
        setAlgorithm(null);
    }
}
