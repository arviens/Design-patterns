package game.environment.abstractObject.common;

import game.environment.object.common.ActorType;

/**
 * Abstract class which contains fields of all game objects
 * Movable objects such as Player, Monster.
 */
public abstract class AbstractActor extends AbstractCollidable {
    private int health;
    private ActorType type;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ActorType getType() {
        return type;
    }

    public void setType(ActorType type) {
        this.type = type;
    }

}
