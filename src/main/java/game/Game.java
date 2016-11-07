package game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;
import game.environment.abstractObject.common.AbstractCollidable;
import game.environment.object.item.HeartItem;
import game.environment.object.player.Player;
import util.Drawable;
import util.DrawableType;

import java.util.List;
import java.util.Map;

public class Game extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture img;
    private Music music;
    private OrthographicCamera camera;
    private BodyDef bodyDef;
    private Rectangle bucket;
    private World world;
    private HeartItem item;

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("assets/images/batman.png");
        item = new HeartItem();
        Player player = new Player();
        Drawable.addToMap(DrawableType.ITEM, item);
        Drawable.addToMap(DrawableType.PLAYER, player);
//        music = Gdx.audio.newMusic(Gdx.files.internal("assets/batman.mp3"));
//        music.setLooping(true);
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 400, 800);
        bucket = new Rectangle();
        bucket.x = 200 / 2 - 64 / 2;
        bucket.y = 20;
        bucket.width = 20;
        bucket.height = 40;
        this.bodyDef = new BodyDef();
        //music.play();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(100, 300);
//        world = new World(new Vector2(0, -10), true);
//        Body body = world.createBody(bodyDef);
//        world.step(1/60f, 6, 2);

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(img, bucket.x, bucket.y);
        for (Map.Entry<DrawableType, List<AbstractCollidable>> value : Drawable.getEnvironmentObjects().entrySet()) {
            for (AbstractCollidable collidable : value.getValue()) {
                batch.draw(collidable.getSprite(), collidable.getX(), collidable.getY());
                collidable.move();
            }
        }
        camera.update();
        batch.end();
    }


    @Override
    public void dispose() {
        batch.dispose();
//        music.dispose();
        img.dispose();
    }
}
