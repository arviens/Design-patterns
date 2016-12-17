package game.factory;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import game.environment.object.common.Sprite;

import java.util.HashMap;

public class SpriteFactory {
    private static final HashMap<String, Sprite> spritesByPath = new HashMap<String, Sprite>();

    public static Sprite getSprite(String path) {
        Sprite sprite = spritesByPath.get(path);
        //TODO add null object
        if (sprite == null) {
            sprite = new Sprite(path);
            spritesByPath.put(path, sprite);
        }

        return sprite;
    }

    public static void changeSprite() {
        getSprite("src/main/resources/assets/sprites/items/banana.png").setSprite(new com.badlogic.gdx.graphics.g2d.Sprite(new Texture(new FileHandle("src/main/resources/assets/sprites/items/coin.png"))));
    }
}
