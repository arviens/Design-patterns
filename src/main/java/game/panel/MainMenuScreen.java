package game.panel;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import game.GameBase;

import util.GameState;
import util.ScreenComponentDrawing;

public class MainMenuScreen extends ScreenComponentDrawing implements Screen {
    final GameBase gameBase;

    // TODO visu viewu singleton padaryt ir itemus reikalingus ipist i parametrus

    public MainMenuScreen(final GameBase gam) {

        gameBase = gam;
        stage = new Stage();
        skin = new Skin();

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

    public void show() {
    }

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
}
