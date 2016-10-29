import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import game.Game;
import helper.Config;

public class Launcher {
	//TODO add class in magic draw
	//TODO add simple  weapon class that extends abstractObject weapon
	//TODO maybe remove iSprite interface
	//TODO pasiskaityti 1 skaidres apie rysius
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		Config gameConfig = Config.getInstance();
		config.resizable = false;
		config.width = gameConfig.getProperties().getWidth();
		config.height = gameConfig.getProperties().getHeight();
		config.title = gameConfig.getProperties().getTitle();
		new LwjglApplication(new Game(), config);
	}
}
