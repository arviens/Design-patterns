package game.panel;

import game.algorithm.panel.Shop;
import game.environment.abstractObject.common.AbstractCollidable;
import helper.Config;

public class ShopScreen extends AbstractCollidable {

    private final static String PANEL_SPRITE = "src/main/resources/assets/sprites/panel/panel.png";

    public ShopScreen() {
        setSprite(getSpriteByName(PANEL_SPRITE));
        int top = (int) (Config.getInstance().getProperties().getHeight() - getSprite().getHeight());
        int left = (int) (Config.getInstance().getProperties().getWidth() - getSprite().getWidth());
        setAlgorithm(new Shop());
        setY(top - top /2);
        setX(left - left /2);

    }
}
