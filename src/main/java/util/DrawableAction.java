package util;

import game.environment.abstractObject.enemy.AbstractEnemy;
import game.environment.abstractObject.item.AbstractItem;
import game.environment.abstractObject.player.AbstractPlayer;
import game.environment.abstractObject.surrounding.platform.AbstractPlatform;
import game.environment.abstractObject.weapon.AbstractWeapon;

import java.util.ArrayList;
import java.util.List;

public class DrawableAction {
    private List<AbstractEnemy> enemiesList;
    private List<AbstractPlayer> playersList;
    private List<AbstractItem> itemsList;
    private List<AbstractWeapon> weaponsList;
    private List<AbstractPlatform> platformList;

    public DrawableAction() {
        enemiesList = new ArrayList<AbstractEnemy>();
        playersList = new ArrayList<AbstractPlayer>();
        itemsList = new ArrayList<AbstractItem>();
        weaponsList = new ArrayList<AbstractWeapon>();
        platformList = new ArrayList<AbstractPlatform>();
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

    public void addPlatform(AbstractPlatform platform) {
        platformList.add(platform);
    }

    public List<AbstractPlatform> getPlatformList() {
        return platformList;
    }


}
