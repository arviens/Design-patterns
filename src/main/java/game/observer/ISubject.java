package game.observer;


import game.command.ICommand;
import game.environment.object.enemy.EnemyType;

public interface ISubject {
    public void register(IObserver o);

    public void unregister(IObserver o);

    public void notifyObserver(EnemyType enemyType, ICommand cmd);
    public void notifyObserver(ICommand cmd);

}
