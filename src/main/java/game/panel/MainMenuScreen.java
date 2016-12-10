package game.panel;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import game.GameBase;

import util.GameState;

public class MainMenuScreen implements Screen {
    final GameBase gameBase;
    Stage stage;
    Skin skin;
    // TODO visu viewu singleton padaryt ir itemus reikalingus ipist i parametrus
    public static MainMenuScreen mainMenuScreen;

    public MainMenuScreen(final GameBase gam) {

        gameBase = gam;
        if (mainMenuScreen == null) {

            stage = new Stage();
            skin = new Skin();

            Gdx.input.setInputProcessor(stage);

            TextButton startGame = this.createButton("Start Game");
            startGame.setPosition(150, 612);
            startGame.setHeight(50);
            startGame.setWidth(100);
            startGame.addListener(new ChangeListener() {
                public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                    gameBase.setGameScreen(GameState.RUN);
                }
            });

            TextButton shop = this.createButton("Shop");
            shop.setPosition(150, 512);
            shop.setHeight(50);
            shop.setWidth(100);
            shop.addListener(new ChangeListener() {
                public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                    gameBase.setGameScreen(GameState.SHOP);
                }
            });

            TextButton quit = this.createButton("Quit");
            quit.setPosition(150, 412);
            quit.setHeight(50);
            quit.setWidth(100);
            quit.addListener(new ChangeListener() {
                public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                    System.exit(0);
                }
            });
        }
    }

    public void show() {}

    public void render(float delta) {
        stage.draw();
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

    }

    public TextButton createButton(String text) {
        Pixmap pixmap = new Pixmap(100, 100, Pixmap.Format.RGBA8888);
        pixmap.setColor(Color.GREEN);
        pixmap.fill();

        skin.add("white", new Texture(pixmap));

        BitmapFont bfont = new BitmapFont();
        skin.add("default", bfont);

        TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.up = skin.newDrawable("white", Color.DARK_GRAY);
        textButtonStyle.down = skin.newDrawable("white", Color.DARK_GRAY);
        textButtonStyle.checked = skin.newDrawable("white", Color.BLUE);
        textButtonStyle.over = skin.newDrawable("white", Color.LIGHT_GRAY);

        textButtonStyle.font = skin.getFont("default");
        skin.add("default", textButtonStyle);
        final TextButton textButton = new TextButton(text, textButtonStyle);
        stage.addActor(textButton);

        return textButton;
    }
}
