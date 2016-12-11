package game.command.enemy.zombie;

import game.command.ICommand;
import game.command.IEnemy;

public class ZombieAttack implements ICommand {
    IEnemy enemy;

    public ZombieAttack(IEnemy enemy) {
        this.enemy = enemy;
    }

    public void execute() {
        enemy.attack();
    }

}
