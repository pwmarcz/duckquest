package pl.pwmarcz.duckquest.tiles;

import pl.pwmarcz.duckquest.Player;
import pl.pwmarcz.duckquest.items.Item;

public class DoorTile extends AbstractBaseTile {
    boolean open = false;

    @Override
    public char getChar() {
        return open ? ':' : '+';
    }

    @Override
    public boolean canEnter(Player player) {
        if (player.hasItem("key")) {
            open = true;
        }
        return open;
    }
}
