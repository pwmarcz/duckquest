package pl.pwmarcz.duckquest;

import pl.pwmarcz.duckquest.items.Item;
import pl.pwmarcz.duckquest.tiles.Tile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

public class Game {
    GameMap map = new GameMap();

    void play() throws IOException {
        BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));
        boolean quit = false;

        while (!quit) {
            drawMap();
            drawInventory();
            System.out.println("Command? [udlrpq]");
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
                case "p":
                    pickUp();
                    break;
                case "r":
                    move(1, 0);
                    break;
            }
        }
    }

    private void drawInventory() {
        Collection<Item> items = map.getPlayer().getItems();
        System.out.print("Inventory: ");
        for (Item item: items)
            System.out.print(item.getName() + ", ");
        System.out.println();
    }

    private void move(int dx, int dy) {
        map.movePlayer(dx, dy);
    }

    private void pickUp() {
        Item item = map.pickUp();
        if (item != null) {
            System.out.println("Picked up " + item.getName());
        }
    }

    void drawMap() {
        Player player = map.getPlayer();
        int playerX = player.getX();
        int playerY = player.getY();
        for (int y = 0; y < map.getHeight(); y++) {
            for (int x = 0; x < map.getWidth(); x++) {
                System.out.print(map.getChar(x, y));
            }
            System.out.println();
        }
    }
}
