package util;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class SpriteInitialize {
    public static Sprite getSprite(String texturePath) {
        return new Sprite(new Texture(new FileHandle(texturePath)));
    }
}
