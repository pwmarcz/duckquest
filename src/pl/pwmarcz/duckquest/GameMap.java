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

    public GameMap() {
        width = DEFAULT_WIDTH;
        height = DEFAULT_HEIGHT;
        tiles = new Tile[height][width];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                switch(DEFAULT_MAP[y].charAt(x)) {
                    case '#':
                        tiles[y][x] = new WallTile();
                        break;
                    case '.':
                        tiles[y][x] = new FloorTile();
                        break;
                    default:
                        tiles[y][x] = new EmptyTile();
                        break;
                }
            }
        }
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public Tile getTile(int y, int x) { return tiles[y][x]; }
}