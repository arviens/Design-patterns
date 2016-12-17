package util;

import game.environment.abstractObject.enemy.AbstractEnemy;
import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.player.AbstractPlayer;
import game.environment.abstractObject.weapon.AbstractWeapon;

import java.util.ArrayList;
import java.util.List;

public class DrawableAction {
    private static List<AbstractEnemy> enemiesList;
    private static List<AbstractPlayer> playersList;
    private static List<AbstractItem> itemsList;
    private static List<AbstractWeapon> weaponsList;

    public DrawableAction() {
        enemiesList = new ArrayList<AbstractEnemy>();
        playersList = new ArrayList<AbstractPlayer>();
        itemsList = new ArrayList<AbstractItem>();
        weaponsList = new ArrayList<AbstractWeapon>();
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

    public void addWeapon(AbstractWeapon weapon) {
        weaponsList.add(weapon);
    }

    public List<AbstractWeapon> getWeapons() {
        return weaponsList;
    }
}
