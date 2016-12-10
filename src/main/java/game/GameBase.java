package game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import game.environment.object.item.ItemType;
import game.factory.object.ItemFactory;
import game.panel.GameScreen;
import game.panel.MainMenuScreen;
import game.panel.ShopScreen;
import util.Drawable;
import util.DrawableType;
import util.GameState;

import java.util.ArrayList;

public class GameBase extends Game {
    public SpriteBatch batch;
    public BitmapFont font;
    OrthographicCamera camera;

    private Screen shopScreen;
    private Screen mainMenuScreen;
    private Screen runScreen;


    public void create() {

        ItemFactory itemFactory = new ItemFactory();
        Drawable.addToMap(DrawableType.ITEM, itemFactory.getAbstractItem(ItemType.HEART));
        Drawable.addToMap(DrawableType.ITEM, itemFactory.getAbstractItem(ItemType.HEART_BAD));

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
        batch = new SpriteBatch();
        font = new BitmapFont();
        this.setScreen(new MainMenuScreen(this));
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
        switch (screen){
            case SHOP:
                setScreen(getShopScreen());
                break;
            case MENU:
                setScreen(getMainMenuScreen());
                break;
            case RUN:
                setScreen(getRunScreen());
        }
    }

    private Screen getShopScreen() {
        if(shopScreen == null){
            shopScreen = new ShopScreen(this);
        }

        return shopScreen;
    }

    private Screen getMainMenuScreen(){
        if(mainMenuScreen == null){
            mainMenuScreen = new MainMenuScreen(this);
        }

        return mainMenuScreen;
    }

    private Screen getRunScreen(){
        if(runScreen == null){
            runScreen = new GameScreen(this);
        }

        return runScreen;
    }
}
