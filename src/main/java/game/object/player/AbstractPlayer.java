package game.object.player;


import game.object.common.AbstractActor;
import game.sound.AbstractSound;

/**
 * Stores information about player
 */
public abstract class AbstractPlayer extends AbstractActor {
    //TODO keyboard, sound
    private AbstractSound bounceSound;

    private Keyboard keyboard;

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
}
