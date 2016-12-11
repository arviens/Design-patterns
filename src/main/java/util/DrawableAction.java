package util;

import game.environment.abstractObject.enemy.AbstractEnemy;
import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.player.AbstractPlayer;

import java.util.ArrayList;
import java.util.List;

public class DrawableAction {
    private static List<AbstractEnemy> enemiesList;
    private static List<AbstractPlayer> playersList;
    private static List<AbstractItem> itemsList;

    public DrawableAction() {
        enemiesList = new ArrayList<AbstractEnemy>();
        playersList = new ArrayList<AbstractPlayer>();
        itemsList = new ArrayList<AbstractItem>();
    }

    public void addEnemy(AbstractEnemy enemy) {
        enemiesList.add(enemy);
    }

    public List<AbstractEnemy> getEnemies() {
        return enemiesList;
    }

    public void addPlayer(AbstractPlayer player) {
        playersList.add(player);
    }

    public List<AbstractPlayer> getPlayers() {
        return playersList;
    }

    public void addItem(AbstractItem item) {
        itemsList.add(item);
    }

    public List<AbstractItem> getItems() {
        return itemsList;
    }
}
