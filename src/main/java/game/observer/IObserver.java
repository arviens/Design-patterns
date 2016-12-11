package game.observer;

import game.command.ICommand;
import game.environment.object.enemy.EnemyType;
import util.DrawableType;


public interface IObserver {
    public void update(ICommand cmd);
}
