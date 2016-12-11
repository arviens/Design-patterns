package game.observer;

import game.command.ICommand;
import game.command.enemy.EnemyControl;
import game.command.enemy.zombie.ZombieFlee;
import game.environment.abstractObject.enemy.AbstractEnemy;
import game.environment.object.enemy.EnemyType;
import util.Drawable;

import java.util.ArrayList;
import java.util.Observer;

/**
 * Created by kalafioras on 2016-12-11.
 */
public class Commander implements ISubject {

    private ArrayList<IObserver> observers;


    public Commander() {
        this.observers = new ArrayList<IObserver>();
    }

    public void register(IObserver o) {
        observers.add(o);
    }

    public void unregister(IObserver o) {

        observers.remove(o);

    }

    public void notifyObserver(EnemyType enemyType, ICommand cmd) {
        //for()
    }

    public void notifyObserver(ICommand cmd) {
        for(IObserver observer : observers)
        {

            observer.update(cmd);
        }
    }
}
