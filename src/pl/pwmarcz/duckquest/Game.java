package pl.pwmarcz.duckquest;

import pl.pwmarcz.duckquest.tiles.Tile;

public class Game {
    GameMap map = new GameMap();

    void play() {
        drawMap();
    }

    void drawMap() {
        for (int y = 0; y < map.getHeight(); y++) {
            for (int x = 0; x < map.getWidth(); x++) {
                Tile tile = map.getTile(y, x);
                if (tile != null) {
                    System.out.print(tile.getChar());
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
