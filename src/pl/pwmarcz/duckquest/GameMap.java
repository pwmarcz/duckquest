package pl.pwmarcz.duckquest;

import pl.pwmarcz.duckquest.items.Item;
import pl.pwmarcz.duckquest.items.KeyItem;
import pl.pwmarcz.duckquest.tiles.*;

public class GameMap {
    static String[] DEFAULT_MAP = new String[] {
            " ####################           ",
            " #.....@............#    #######",
            " #..................######     #",
            " #........................     #",
            " #..}...............######     #",
            " #######+############    ###.###",
            "       #.#                 #.#  ",
            "       #.#                 #.#  ",
            "       #.#                ##.## ",
            "     ###+####             #...# ",
            "     #.[....#             #.*.# ",
            "     #......#             #...# ",
            "     ########             ##### ",
    };
    static int DEFAULT_WIDTH = 32;
    static int DEFAULT_HEIGHT = 13;

    private int width, height;
    private Tile[][] tiles;
    private Player player;

    public GameMap() {
        width = DEFAULT_WIDTH;
        height = DEFAULT_HEIGHT;
        tiles = new Tile[width][height];

        int playerX = 0, playerY = 0;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                switch(DEFAULT_MAP[y].charAt(x)) {
                    case '#':
                        tiles[x][y] = new WallTile();
                        break;
                    case '.':
                        tiles[x][y] = new FloorTile();
                        break;
                    case '@':
                        tiles[x][y] = new FloorTile();
                        playerX = x;
                        playerY = y;
                        break;
                    case '}':
                        tiles[x][y] = new FloorTile();
                        tiles[x][y].addItem(new KeyItem());
                        break;
                    case '+':
                        tiles[x][y] = new DoorTile();
                        break;
                    default:
                        tiles[x][y] = new EmptyTile();
                        break;
                }
            }
        }

        player = new Player(playerX, playerY);
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public Tile getTile(int x, int y) { return tiles[x][y]; }
    public Player getPlayer() { return player; }

    public void movePlayer(int dx, int dy) {
        int newX = player.getX() + dx;
        int newY = player.getY() + dy;
        Tile newTile = getTile(newX, newY);
        if (newTile.canEnter(player)) {
            player.moveTo(newX, newY);
        }
    }

    public Item pickUp() {
        Tile tile = getPlayerTile();
        Item item = tile.getItem();
        if (item != null) {
            tile.removeItem();
            player.addItem(item);
        }
        return item;
    }

    private Tile getPlayerTile() {
        return getTile(player.getX(), player.getY());
    }
}
