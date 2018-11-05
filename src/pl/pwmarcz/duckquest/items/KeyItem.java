package pl.pwmarcz.duckquest.items;

public class KeyItem implements Item {
    @Override
    public char getChar() {
        return '{';
    }

    @Override
    public String getName() {
        return "key";
    }
}
