package game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import game.environment.abstractObject.enemy.AbstractEnemy;
import game.environment.abstractObject.player.AbstractPlayer;
import game.environment.object.enemy.EnemyType;
import game.factory.actor.EnemyFactory;
import game.observer.Commander;
import game.panel.GameScreen;
import game.panel.MainMenuScreen;
import game.panel.ShopScreen;
import helper.Config;
import helper.logger.Logger;
import helper.logger.LoggerLevel;
import util.Drawable;
import util.DrawableType;
import util.GameProperties;
import util.GameState;

public class GameBase extends Game {
    public SpriteBatch batch;
    public BitmapFont font;
    public OrthographicCamera camera;

    private ShopScreen shopScreen;
    private MainMenuScreen mainMenuScreen;
    private GameScreen runScreen;
    public Commander commander;
    public static World world = new World(new Vector2(0, -98f), true);


    public void create() {
        world.setContactListener(new ContactListener() {
            public void beginContact(Contact contact) {
                if(contact.getFixtureA().getFilterData().groupIndex == 1 ||
                        contact.getFixtureB().getFilterData().groupIndex == 1){
                    AbstractPlayer player = Drawable.getLists().getPlayers().get(0);
                    player.getBody().setLinearVelocity(0, 980000f);
                }
            }

            public void endContact(Contact contact) {

            }

            public void preSolve(Contact contact, Manifold oldManifold) {

            }

            public void postSolve(Contact contact, ContactImpulse impulse) {

            }
        });
        Box2D.init();
        commander = new Commander();
        EnemyFactory enemyFactory = new EnemyFactory(commander);
//        AbstractEnemy blockSad = enemyFactory.getAbstractEnemy(EnemyType.BLOCK_SAD);
//        AbstractEnemy blockMad = enemyFactory.getAbstractEnemy(EnemyType.BLOCK_MAD);
//        commander.register(blockSad);
//        commander.register(blockMad);
//        Drawable.addToMap(DrawableType.ENEMY, blockSad);
//        Drawable.addToMap(DrawableType.ENEMY, blockMad);

        GameProperties config = Config.getInstance().getProperties();
        camera = new OrthographicCamera(config.getWidth(), config.getHeight());
        camera.setToOrtho(false);
        camera.position.set(camera.viewportHeight / 2f, camera.viewportHeight / 2f, 0);
        camera.update();


        batch = new SpriteBatch();
        font = new BitmapFont();
        setGameScreen(GameState.MENU);

    }

    public void render() {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        super.render();
    }

    public void dispose() {
        batch.dispose();
    }

    public void setGameScreen(GameState screen) {
        switch (screen) {
            case SHOP:
                setScreen(getShopScreen());
                Gdx.input.setInputProcessor(shopScreen.stage);
                break;
            case MENU:
                setScreen(getMainMenuScreen());
                Gdx.input.setInputProcessor(mainMenuScreen.stage);
                break;
            case RUN:
                setScreen(getRunScreen());
        }
    }

    private Screen getShopScreen() {
        if (shopScreen == null) {
            shopScreen = new ShopScreen(this);
        }

        return shopScreen;
    }

    private Screen getMainMenuScreen() {
        if (mainMenuScreen == null) {
            mainMenuScreen = new MainMenuScreen(this);
        }

        return mainMenuScreen;
    }

    private Screen getRunScreen() {
        if (runScreen == null) {
            runScreen = new GameScreen(this);
        }

        return runScreen;
    }
}
