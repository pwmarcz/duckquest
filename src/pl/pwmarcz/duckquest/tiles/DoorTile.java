package pl.pwmarcz.duckquest.tiles;

public class DoorTile extends AbstractBaseTile {
    @Override
    public char getChar() {
        return '+';
    }

    @Override
    public boolean canEnter() {
        return false;
    }
}
