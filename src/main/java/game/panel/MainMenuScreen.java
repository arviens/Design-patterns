package game.panel;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import game.Drop;
import game.GameBase;

public class MainMenuScreen implements Screen {
    final Drop game;
    Stage stage;
    Skin skin;

    public MainMenuScreen(final Drop gam) {
        stage = new Stage();
        skin = new Skin();
        game = gam;
        Gdx.input.setInputProcessor(stage);

        TextButton startGame = this.createButton("Start game");
        startGame.setPosition(125, 612);
        startGame.addListener(new ChangeListener() {
            public void changed(ChangeListener.ChangeEvent event, Actor actor) {
                game.setScreen(new GameBase(game));
            }
        });


    }


    public void show() {

    }

    public void render(float delta) {
        stage.draw();
        System.out.println(Gdx.input.getX() + "," + Gdx.input.getY());
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

    private TextButton createButton(String text) {
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
