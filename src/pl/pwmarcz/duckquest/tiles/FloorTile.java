package pl.pwmarcz.duckquest.tiles;

public class FloorTile extends AbstractBaseTile {
    @Override
    public char getChar() {
        return '.';
    }

    @Override
    public boolean canEnter() {
        return true;
    }
}
