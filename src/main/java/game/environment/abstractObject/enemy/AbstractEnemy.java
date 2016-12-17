package game.environment.abstractObject.enemy;

import game.command.IEnemy;
import game.environment.abstractObject.common.AbstractActor;
import game.observer.Commander;
import game.observer.IObserver;

public abstract class AbstractEnemy extends AbstractActor implements IEnemy, IObserver {
    private Commander commander;

    public AbstractEnemy(Commander commander) {
        this.commander = commander;
    }
}
