package game.panel;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import game.GameBase;
import game.environment.abstractObject.item.AbstractItem;
import game.environment.object.item.HeartItem;
import game.environment.object.item.ItemType;
import game.environment.object.item.ShroomItem;
import util.GameState;

import java.util.ArrayList;
import java.util.List;

public class ShopScreen implements Screen {
    final GameBase gameBase;
    private Table table;
    private List<AbstractItem> buyableItems;
    Stage stage;
    Skin skin;

    public ShopScreen(final GameBase gameBase) {
        buyableItems = getBuyableItems();
        this.gameBase = gameBase;
        stage = new Stage();
        skin = new Skin();
        Gdx.input.setInputProcessor(stage);
        skin = new Skin(Gdx.files.internal("src/main/resources/assets/uiskin.json"));
        Table table = new Table();
        table.setPosition(200, 200);
        table.add(new Label("Name", skin));
        table.add(new Label("Price", skin));
        table.add(new Label("Action", skin));
        table.row();
        for (final AbstractItem buyable : buyableItems) {
            Label buyButton = new Label("Buy", skin);
            buyButton.addListener(new ClickListener(){
                public void clicked(InputEvent e, float x, float y){
                    System.out.println("Buy " + buyable.getName());
                }
            });

            table.add(new Label(buyable.getName(), skin));
            table.add(new Label(String.valueOf(buyable.getPrice()), skin));
            table.add(buyButton);
            table.row();
        }

        Label buyButton = new Label("Buy", skin);
        buyButton.addListener(new ClickListener(){
            public void clicked(InputEvent e, float x, float y){
                gameBase.setGameScreen(GameState.MENU);
            }
        });
        table.add(buyButton);

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

    private List<AbstractItem> getBuyableItems() {
        List<AbstractItem> arr = new ArrayList<AbstractItem>();
        arr.add(new HeartItem(ItemType.HEART));
        arr.add(new HeartItem(ItemType.HEART_BAD));
        arr.add(new ShroomItem(ItemType.SHROOM));
        arr.add(new ShroomItem(ItemType.SHROOM_BAD));

        return arr;
    }
}
