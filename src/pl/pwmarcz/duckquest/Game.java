package pl.pwmarcz.duckquest;

import pl.pwmarcz.duckquest.tiles.Tile;

public class Game {
    GameMap map = new GameMap();

    void play() {
        drawMap();
    }

    void drawMap() {
        Player player = map.getPlayer();
        int playerX = player.getX();
        int playerY = player.getY();
        for (int y = 0; y < map.getHeight(); y++) {
            for (int x = 0; x < map.getWidth(); x++) {
                if (x == playerX && y == playerY) {
                    System.out.print(player.getChar());
                } else {
                    Tile tile = map.getTile(y, x);
                    System.out.print(tile.getChar());
                }
            }
            System.out.println();
        }
    }
}
