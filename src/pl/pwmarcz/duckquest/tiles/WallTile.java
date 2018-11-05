package pl.pwmarcz.duckquest.tiles;

public class WallTile extends AbstractBaseTile {
    @Override
    public char getChar() {
        return '#';
    }

    @Override
    public boolean canEnter() {
        return false;
    }
}
