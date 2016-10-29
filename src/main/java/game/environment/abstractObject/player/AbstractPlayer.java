package game.environment.abstractObject.player;


import game.environment.abstractObject.common.AbstractActor;
import game.environment.abstractObject.weapon.AbstractWeapon;
import game.environment.object.player.Keyboard;
import game.sound.AbstractSound;

/**
 * Stores information about player
 */
public abstract class AbstractPlayer extends AbstractActor {
    private AbstractSound bounceSound;
    private Keyboard keyboard;
    private AbstractWeapon weapon;
    private int score;

    public AbstractSound getBounceSound() {
        return bounceSound;
    }

    public void setBounceSound(AbstractSound bounceSound) {
        this.bounceSound = bounceSound;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public AbstractWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(AbstractWeapon weapon) {
        this.weapon = weapon;
    }
}
