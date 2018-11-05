package pl.pwmarcz.duckquest;

import pl.pwmarcz.duckquest.items.Item;

import java.util.*;

public class Player {
    private int x, y;
    private List<Item> items;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        items = new LinkedList<>();
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

    public List<Item> getItems() {
        return items;
    }

    public boolean hasItem(String name) {
        for (Item item: items) {
            if (item.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
