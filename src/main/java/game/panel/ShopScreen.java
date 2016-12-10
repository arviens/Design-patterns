package game.panel;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import game.GameBase;

public class ShopScreen implements Screen {
    final GameBase gameBase;
    private Table table;
    Stage stage;
    Skin skin;

    public ShopScreen(GameBase gameBase) {
        this.gameBase = gameBase;
        stage = new Stage();
        skin = new Skin();
        Gdx.input.setInputProcessor(stage);
        skin = new Skin(Gdx.files.internal("src/main/resources/assets/uiskin.json"));
        Label nameLabel = new Label("Name:", skin);
        TextField nameText = new TextField("Text", skin);
        Label addressLabel = new Label("Address:", skin);
        TextField addressText = new TextField("text", skin);

        Table table = new Table();
        table.add(nameLabel);
        table.add(nameText).width(100);
        table.setPosition(200,200);
        table.row();
        table.add(addressLabel);
        table.add(addressText).width(100);
        stage.addActor(table);

        table.setDebug(true);
    }

    public void create() {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);

        table = new Table();
        table.setFillParent(true);
        stage.addActor(table);

        table.setDebug(true); // This is optional, but enables debug lines for tables.

        // Add widgets to the table here.
    }

    public void show() {

    }


    public void resize(int width, int height) {
        stage.getViewport().update(width, height, true);
    }

    public void pause() {

    }

    public void resume() {

    }

    public void hide() {

    }

    public void render(float delta) {
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
        System.out.println("Shop");
    }

    public void dispose() {
        stage.dispose();
    }
}
