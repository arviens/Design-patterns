package game.environment.abstractObject.player;


import game.environment.abstractObject.common.AbstractActor;
import game.environment.abstractObject.weapon.AbstractWeapon;
import game.environment.object.player.Keyboard;
import game.sound.AbstractSound;
import util.Drawable;
import util.DrawableType;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores information about player
 */
public abstract class AbstractPlayer extends AbstractActor {
    private AbstractSound bounceSound;
    private Keyboard keyboard;
    private List<AbstractWeapon> weapons;
    private int score;

    public AbstractPlayer() {
        weapons = new ArrayList<AbstractWeapon>();
        score = 0;
    }

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

    public void addWeapon(AbstractWeapon weapon) {
        weapons.add(weapon);
    }

    public boolean shootWeapon() {
        if (!weapons.isEmpty()) {
            AbstractWeapon firstWeapon = weapons.get(0);
            firstWeapon.setX(this.getX());
            firstWeapon.setY(this.getY());
            firstWeapon.staticBody();
            Drawable.addToMap(DrawableType.WEAPON, firstWeapon);
            weapons.remove(firstWeapon);
            return true;
        }

        return false;
    }
}
