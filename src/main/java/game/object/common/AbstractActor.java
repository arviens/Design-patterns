package game.object.common;

/**
 * Abstract class which contains fields of all game objects
 */
public abstract class AbstractActor extends AbstractCollidable {
    private int health;
    private float speed;
    private ActorType type;

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
