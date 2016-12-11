package game.command.enemy.zombie;

import game.command.ICommand;
import game.command.IEnemy;

/**
 * Created by arvyd on 2016-12-11.
 */
public class ZombieFlee implements ICommand {
    IEnemy enemy;

    public ZombieFlee(IEnemy enemy) {
        this.enemy = enemy;
    }

    public void execute() {
        enemy.flee();
    }
}
