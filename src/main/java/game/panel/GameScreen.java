package game.panel;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import game.GameBase;
import game.command.enemy.EnemyControl;
import game.command.enemy.zombie.ZombieAttack;
import game.command.enemy.zombie.ZombieFlee;
import game.environment.abstractObject.common.AbstractCollidable;
import game.environment.abstractObject.enemy.AbstractEnemy;
import game.environment.object.enemy.BlockMadEnemy;
import game.environment.object.player.Player;
import util.Drawable;
import util.DrawableType;

import java.util.List;
import java.util.Map;

public class GameScreen implements Screen {
    private GameBase gameBase;
    private Texture img;
    private BodyDef bodyDef;
    Body body;
    private Player player;

    private World world;


    public GameScreen(final GameBase gameBase) {
        this.gameBase = gameBase;

        img = new Texture("assets/images/batman.png");

        player = new Player();
        Box2D.init();
        world = new World(new Vector2(0, -98f), true);
        Drawable.addToMap(DrawableType.PLAYER, player);
        this.bodyDef = new BodyDef();
        //music.play();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(player.getX(), player.getY());
        body = world.createBody(bodyDef);
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(player.getSprite().getWidth() / 2, player.getSprite().getHeight() / 2);
        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;
        fixtureDef.density = 1f;

        Fixture fixture = body.createFixture(fixtureDef);

        shape.dispose();
    }


    public void render(float delta) {
        world.step(Gdx.graphics.getDeltaTime(), 6, 2);

        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gameBase.batch.begin();

        player.setX((int) body.getPosition().x);
        player.setY((int) body.getPosition().y);
//        System.out.println(body.getPosition().y);
//        gameBase.batch.draw(img, bucket.x, bucket.y);
        for (Map.Entry<DrawableType, List<AbstractCollidable>> value : Drawable.getEnvironmentObjects().entrySet()) {
            for (AbstractCollidable collidable : value.getValue()) {
                gameBase.batch.draw(collidable.getSprite(), collidable.getX(), collidable.getY());
                collidable.move();
            }
        }


        if (Gdx.input.isKeyJustPressed(Input.Keys.UP)) {
            body.setLinearVelocity(body.getLinearVelocity().x, 500);
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.DOWN)) {
            body.setLinearVelocity(body.getLinearVelocity().x, -500);
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.LEFT)) {
            body.setLinearVelocity(-500, body.getLinearVelocity().y);
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)) {
            body.setLinearVelocity(500, body.getLinearVelocity().y);
        }


        if (Gdx.input.isKeyJustPressed(Input.Keys.F)) {
            gameBase.commander.notifyObserver(new ZombieFlee());
        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.A)) {
            EnemyControl enemyControl = null;
            for (AbstractEnemy enemy : Drawable.getLists().getEnemies()) {
                enemyControl = new EnemyControl(new ZombieAttack(enemy));
                enemyControl.action();
            }
        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            gameBase.setScreen(new MainMenuScreen(gameBase));
        }
        gameBase.batch.end();


//        gameBase.camera.position.set(player.getX(), player.getY(), 0);
//        gameBase.camera.update();

//        gameBase.batch.setProjectionMatrix(gameBase.camera.combined);
    }


    public void show() {

    }


    public void resize(int width, int height) {

    }

    public void pause() {

    }

    public void resume() {

    }

    public void hide() {

    }

    public void dispose() {
        gameBase.batch.dispose();
        world.dispose();
        img.dispose();
        System.out.println("disposessss");
    }


}
