package helper;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import util.GameProperties;

import java.io.*;

public final class Config {
    private static final String CONFIG_PATH = "src/main/java/util/config.yaml";
    private static GameProperties properties = new GameProperties();

    private static Config instance;

    private Config() {
    }

    public GameProperties getProperties() {
        return properties;
    }

    public static synchronized Config getInstance() {
        if (instance == null) {
            try {
                YamlReader reader = new YamlReader(new FileReader(CONFIG_PATH));
                properties = reader.read(GameProperties.class);
                instance = new Config();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (YamlException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }
}
