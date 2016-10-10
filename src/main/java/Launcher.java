import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import game.Game;
import helper.Config;

public class Launcher {

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
