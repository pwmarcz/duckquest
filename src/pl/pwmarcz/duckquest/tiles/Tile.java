package pl.pwmarcz.duckquest.tiles;

import pl.pwmarcz.duckquest.Player;
import pl.pwmarcz.duckquest.items.Item;

public interface Tile {
    char getChar();

    boolean canEnter(Player player);

    void addItem(Item item);
    Item getItem();

    void removeItem();
}
