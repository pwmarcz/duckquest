package pl.pwmarcz.duckquest.tiles;

import pl.pwmarcz.duckquest.Player;

public class FloorTile extends AbstractBaseTile {
    @Override
    public char getChar() {
        return '.';
    }

    @Override
    public boolean canEnter(Player player) {
        return true;
    }
}
