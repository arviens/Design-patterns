package game.environment.object.item;

import game.environment.abstractObject.item.AbstractItem;

public class CoinItem extends AbstractItem {
    private final static String COIN_SPRITE = "src/main/resources/assets/sprites/items/coin.png";

    public CoinItem() {
        setSprite(getSpriteByName(COIN_SPRITE));
        setName("Coin");

        setEnhancement(Enhancement.HEALTH);
        setPrice(256);
    }
}
