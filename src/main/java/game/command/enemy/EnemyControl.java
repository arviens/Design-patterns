package game.command.enemy;

import game.command.ICommand;

public class EnemyControl {
    ICommand command;

    public EnemyControl(ICommand command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
