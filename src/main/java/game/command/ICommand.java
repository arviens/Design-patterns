package game.command;

public interface ICommand {
    void execute();
    void setEnemy(IEnemy enemy);
}
