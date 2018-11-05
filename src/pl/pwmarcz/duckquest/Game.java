package pl.pwmarcz.duckquest;

import pl.pwmarcz.duckquest.tiles.Tile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    GameMap map = new GameMap();

    void play() throws IOException {
        BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));
        boolean quit = false;

        while (!quit) {
            drawMap();
            System.out.println("Command? [udlrq]");
            String command = consoleIn.readLine();

            switch (command) {
                case "q":
                    quit = true;
                    break;
                case "u":
                    move(0, -1);
                    break;
                case "d":
                    move(0, 1);
                    break;
                case "l":
                    move(-1, 0);
                    break;
                case "r":
                    move(1, 0);
                    break;
            }
        }
    }

    private void move(int dx, int dy) {
        map.movePlayer(dx, dy);
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
                    Tile tile = map.getTile(x, y);
                    System.out.print(tile.getChar());
                }
            }
            System.out.println();
        }
    }
}
