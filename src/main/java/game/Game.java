package game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;

public class Game extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture img;
    private Music music;
    private OrthographicCamera camera;
    private BodyDef bodyDef;
    private Rectangle bucket;
    private World world;

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("assets/images/batman.png");
        music = Gdx.audio.newMusic(Gdx.files.internal("assets/batman.mp3"));
        music.setLooping(true);

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 400, 800);
        bucket = new Rectangle();
        bucket.x = 400 / 2 - 64 / 2;
        bucket.y = 20;
        bucket.width = 47;
        bucket.height = 83;
        this.bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(100,300);
//        world = new World(new Vector2(0, -10), true);
//        Body body = world.createBody(bodyDef);
//        world.step(1/60f, 6, 2);

    }

    @Override
    public void render() {
        music.play();
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(img, bucket.x, bucket.y);
        camera.update();
        batch.end();
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) bucket.x -= 400 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) bucket.x += 400 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Input.Keys.UP)) bucket.y += 400 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) bucket.y -= 400 * Gdx.graphics.getDeltaTime();
    }

    @Override
    public void dispose() {
        batch.dispose();
        music.dispose();
        img.dispose();
    }
}
