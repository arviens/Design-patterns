package game.panel;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import game.GameBase;
import game.environment.abstractObject.common.AbstractCollidable;
import game.environment.object.item.HeartItem;
import game.environment.object.item.ItemType;
import game.environment.object.player.Player;
import game.factory.object.ItemFactory;
import game.panel.MainMenuScreen;
import util.Drawable;
import util.DrawableType;
import util.GameState;

import java.util.List;
import java.util.Map;

public class GameScreen implements Screen {
    private GameBase gameBase;
    private Texture img;
    private Music music;
    private OrthographicCamera camera;
    private BodyDef bodyDef;
    private Rectangle bucket;
    private World world;
    private HeartItem item;
    private GameState gameState;
    private static GameScreen gameScreen;

    public GameScreen(final GameBase gameBase) {
        this.gameBase = gameBase;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        img = new Texture("assets/images/batman.png");
        Table main = new Table();
//        main.setFillParent(true);

        // Create the tab buttons
//        HorizontalGroup group = new HorizontalGroup();
//        main.add(group);
//        main.row();

//        Drawable.addToMap(DrawableType.PANEL, new ShopScreen());

        Player player = new Player();
//        Drawable.addToMap(DrawableType.ITEM, item);
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
    }

    public void create() {

//        world = new World(new Vector2(0, -10), true);
//        Body body = world.createBody(bodyDef);
//        world.step(1/60f, 6, 2);

    }

    public void pause() {
        this.gameState = GameState.PAUSE;
    }

    public void resume() {
        this.gameState = GameState.RUN;
    }

    public void menu() {
        this.gameState = GameState.MENU;
    }


    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        gameBase.batch.setProjectionMatrix(camera.combined);
        gameBase.batch.begin();
//        gameBase.batch.draw(img, bucket.x, bucket.y);
        for (Map.Entry<DrawableType, List<AbstractCollidable>> value : Drawable.getEnvironmentObjects().entrySet()) {
            for (AbstractCollidable collidable : value.getValue()) {
                gameBase.batch.draw(collidable.getSprite(), collidable.getX(), collidable.getY());
                collidable.move();
            }
        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            gameBase.setScreen(new MainMenuScreen(gameBase));
        }
        gameBase.batch.end();
        camera.update();
//        switch (gameState) {
//            case PAUSE:
//                if (Gdx.input.isKeyJustPressed(Input.Keys.P)) {
//                    System.out.println("resume");
//                    resume();
//                }
//                if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
//                    menu();
//                    System.out.println("menu");
//                }
//                break;
//            case MENU:
//                if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
//                    resume();
//                    System.out.println("resume");
//                }
//
//                break;
//            case RUN:
//                if (Gdx.input.isKeyJustPressed(Input.Keys.P)) {
//                    System.out.println("pause");
//                    pause();
//                }
//                if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
//                    menu();
//                    System.out.println("menu");
//                }
//                gameBase.batch.begin();
//                gameBase.batch.draw(img, bucket.x, bucket.y);
//                for (Map.Entry<DrawableType, List<AbstractCollidable>> value : Drawable.getEnvironmentObjects().entrySet()) {
//                    for (AbstractCollidable collidable : value.getValue()) {
//                        gameBase.batch.draw(collidable.getSprite(), collidable.getX(), collidable.getY());
//                        collidable.move();
//                    }
//                }
//
//                gameBase.batch.end();
//                break;
//        }
    }


    public void show() {

    }


    public void resize(int width, int height) {

    }

    public void hide() {

    }

    public void dispose() {
        gameBase.batch.dispose();
//        music.dispose();
        img.dispose();
        System.out.println("disposessss");
    }
}
