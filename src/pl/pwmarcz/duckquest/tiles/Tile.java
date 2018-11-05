package pl.pwmarcz.duckquest.tiles;

import pl.pwmarcz.duckquest.items.Item;

public interface Tile {
    char getChar();

    boolean canEnter();

    void addItem(Item item);
    Item getItem();
}
