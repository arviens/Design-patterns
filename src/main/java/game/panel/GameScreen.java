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
import game.environment.abstractObject.surrounding.platform.AbstractPlatform;
import game.environment.object.enemy.BlockMadEnemy;
import game.environment.object.player.Player;
import game.environment.object.surrounding.platform.PlatformType;
import game.environment.object.weapon.BananaWeapon;
import game.factory.SpriteFactory;
import game.factory.surrounding.PlatformFactory;
import util.Drawable;
import util.DrawableType;

import java.util.List;
import java.util.Map;

import static game.GameBase.world;

public class GameScreen implements Screen {
    private GameBase gameBase;
    private Texture img;
    private Player player;
    private PlatformFactory pf;

    public GameScreen(final GameBase gameBase) {
        this.gameBase = gameBase;

        img = new Texture("assets/images/batman.png");

        player = new Player();
        player.addWeapon(new BananaWeapon());
        Drawable.addToMap(DrawableType.PLAYER, player);
        pf = new PlatformFactory();
        //music.play();


    }


    public void render(float delta) {
        world.step(Gdx.graphics.getDeltaTime(), 6, 2);
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gameBase.batch.begin();

        for (Map.Entry<DrawableType, List<AbstractCollidable>> value : Drawable.getEnvironmentObjects().entrySet()) {
            for (AbstractCollidable collidable : value.getValue()) {
                gameBase.batch.draw(collidable.getSprite().getSprite(), collidable.getX(), collidable.getY());
                collidable.move();
            }
        }


        if (Gdx.input.isKeyJustPressed(Input.Keys.UP)) {
            player.getBody().setLinearVelocity(player.getBody().getLinearVelocity().x, 500);
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.DOWN)) {
            player.getBody().setLinearVelocity(player.getBody().getLinearVelocity().x, -500);
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.LEFT)) {
            player.getBody().setLinearVelocity(-500, player.getBody().getLinearVelocity().y);
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)) {
            player.getBody().setLinearVelocity(500, player.getBody().getLinearVelocity().y);
        }


        if (Gdx.input.isKeyJustPressed(Input.Keys.O)) {
            player.shootWeapon();
        }



        if (Gdx.input.isKeyJustPressed(Input.Keys.P)) {
            AbstractPlatform plat = pf.getPlatform(PlatformType.DEFAULT);
            plat.setX(player.getX());
            plat.setY(player.getY());
            plat.staticBody();
            Drawable.addToMap(DrawableType.PLATFORM, plat);
        }


        if (Gdx.input.isKeyJustPressed(Input.Keys.A)) {
            SpriteFactory.changeSprite();
        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            gameBase.setScreen(new MainMenuScreen(gameBase));
        }
        gameBase.batch.end();
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
        img.dispose();
        System.out.println("disposessss");
    }


}
