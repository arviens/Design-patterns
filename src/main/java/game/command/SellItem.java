package game.command;

import game.environment.abstractObject.item.AbstractItem;

public class SellItem implements Order {
    private AbstractItem item;

    public SellItem(AbstractItem item) {
        this.item = item;
    }

    public void execute() {
        //TODO Get current player and delete item from him
    }
}
