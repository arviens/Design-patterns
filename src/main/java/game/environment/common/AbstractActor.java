package game.environment.common;

import game.environment.sprite.AbstractSprite;

/**
 * Abstract class which contains fields of all game objects
 * Movable objects such as Player, Monster.
 */
public abstract class AbstractActor extends AbstractCollidable {
    private int health;
    private float speed;
    private ActorType type;
    private AbstractSprite sprite;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public ActorType getType() {
        return type;
    }

    public void setType(ActorType type) {
        this.type = type;
    }
}
