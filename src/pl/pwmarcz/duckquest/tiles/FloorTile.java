package pl.pwmarcz.duckquest.tiles;

public class FloorTile implements Tile {
    @Override
    public char getChar() {
        return '.';
    }

    @Override
    public boolean canEnter() {
        return true;
    }
}
