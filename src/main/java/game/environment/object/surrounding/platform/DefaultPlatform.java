package game.environment.object.surrounding.platform;

import game.environment.abstractObject.surrounding.platform.AbstractPlatform;
import game.factory.SpriteFactory;

public class DefaultPlatform extends AbstractPlatform {
    private final static String PLATFORM_SPRITE = "src/main/resources/assets/sprites/panel/panel.png";

    public DefaultPlatform() {
        isPlatform = 1;
        setSprite(SpriteFactory.getSprite(PLATFORM_SPRITE));
    }

    public boolean isNull() {
        return false;
    }
}
