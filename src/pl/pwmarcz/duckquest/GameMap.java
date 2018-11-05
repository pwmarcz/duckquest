package pl.pwmarcz.duckquest;

import pl.pwmarcz.duckquest.tiles.EmptyTile;
import pl.pwmarcz.duckquest.tiles.FloorTile;
import pl.pwmarcz.duckquest.tiles.Tile;
import pl.pwmarcz.duckquest.tiles.WallTile;

public class GameMap {
    static String[] DEFAULT_MAP = new String[] {
            "####################           ",
            "#.....@............#    #######",
            "#..................######     #",
            "#........................     #",
            "#..}...............######     #",
            "#######+############    ###.###",
            "       #.#                 #.# ",
            "       #.#                 #.# ",
            "       #.#                ##.##",
            "     ###+####             #...#",
            "     #.[....#             #.*.#",
            "     #......#             #...#",
            "     ########             #####",
    };
    static int DEFAULT_WIDTH = 31;
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
        if (newTile.canEnter()) {
            player.moveTo(newX, newY);
        }
    }
}
