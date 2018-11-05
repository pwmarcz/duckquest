package pl.pwmarcz.duckquest.tiles;

public class EmptyTile implements Tile {
    @Override
    public char getChar() {
        return ' ';
    }

    @Override
    public boolean canEnter() {
        return false;
    }
}
