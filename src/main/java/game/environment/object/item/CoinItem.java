package game.environment.object.item;

import game.environment.abstractObject.item.AbstractItem;
import game.factory.SpriteFactory;

public class CoinItem extends AbstractItem {
    private final static String COIN_SPRITE = "src/main/resources/assets/sprites/items/coin.png";

    public CoinItem() {
        setSprite(SpriteFactory.getSprite(COIN_SPRITE));
        setName("Coin");

        setEnhancement(Enhancement.HEALTH);
        setPrice(256);
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
