package game.sound;

/**
 * Created by kalafioras on 2016-10-17.
 */
public abstract class AbstractSound {
    protected int volume = 50;

    protected boolean loaded = false;

    protected final String file;

    protected AbstractSound(String file) {
        this.file = file;
        if(helper.Config.getInstance().getProperties().getVolume() == 0) {
                volume = 0;
            } else {
                volume = helper.Config.getInstance().getProperties().getVolume();
            }
        }
    public abstract void play();

    public String getFile() {
        return file;
    }
    }

