package game.command;

import game.environment.abstractObject.item.AbstractItem;


public class BuyItem implements Order {
    private AbstractItem item;

    public BuyItem(AbstractItem item) {
        this.item = item;
    }

    public void execute() {
        //TODO implement player to check if he haves enough coins
    }
}
