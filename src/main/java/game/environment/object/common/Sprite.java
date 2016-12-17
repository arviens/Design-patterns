package game.environment.object.common;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;

public class Sprite {
    private String spritePath;
    private com.badlogic.gdx.graphics.g2d.Sprite sprite;

    public Sprite(String spritePath) {
        this.spritePath = spritePath;
        this.sprite = new com.badlogic.gdx.graphics.g2d.Sprite(new Texture(new FileHandle(spritePath)));
    }

    public String getSpritePath() {
        return spritePath;
    }

    public void setSpritePath(String spritePath) {
        this.spritePath = spritePath;
    }

    public com.badlogic.gdx.graphics.g2d.Sprite getSprite() {
        return sprite;
    }

    public void setSprite(com.badlogic.gdx.graphics.g2d.Sprite sprite) {
        this.sprite = sprite;
    }
}
