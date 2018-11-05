package pl.pwmarcz.duckquest;

import pl.pwmarcz.duckquest.items.Item;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Player {
    private int x, y;
    private Set<Item> items;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        items = new HashSet<>();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getChar() {
        return '@';
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Collection<Item> getItems() {
        return items;
    }
}
