package pl.pwmarcz.duckquest.tiles;

import pl.pwmarcz.duckquest.items.Item;

public abstract class AbstractBaseTile implements Tile {
    private Item item = null;

    @Override
    public void addItem(Item item) {
        assert item == null;
        this.item = item;
    }

    public Item getItem() {
        return item;
    }
}
