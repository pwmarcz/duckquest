package pl.pwmarcz.duckquest;

public class Player {
    private int x, y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
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

    public void moveTo(int y, int x) {
        this.y = y;
        this.x = x;
    }
}
