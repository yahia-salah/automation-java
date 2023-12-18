package org.example;

import java.util.ArrayList;
import java.util.List;

public class Islands {
    public static void main(String[] args) {
//        String[][] grid = {
//                {"1", "1", "1", "1", "0"},
//                {"1", "1", "0", "1", "0"},
//                {"1", "1", "0", "0", "0"},
//                {"0", "0", "0", "0", "0"}
//        };

        String[][] grid = {
                {"1", "1", "0", "0", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "1", "0", "0"},
                {"0", "0", "0", "1", "1"}
        };

        // identify lands
        List<Land> lands = new ArrayList<>();
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                if (grid[y][x] == "1") {
                    var land = new Land(x, y);
                    lands.add(land);
                }
            }
        }

        // identify neighborhoods
        for (Land land : lands) {
            lands.stream().filter(l -> l.x == land.x && l.y == land.y - 1).findFirst().ifPresent(l -> land.north = l);
            lands.stream().filter(l -> l.x == land.x && l.y == land.y + 1).findFirst().ifPresent(l -> land.south = l);
            lands.stream().filter(l -> l.x == land.x + 1 && l.y == land.y).findFirst().ifPresent(l -> land.east = l);
            lands.stream().filter(l -> l.x == land.x - 1 && l.y == land.y).findFirst().ifPresent(l -> land.west = l);
        }

        int islandsCount = 0;
        int landsVisited = 0;

        while (landsVisited < lands.size()) {
            islandsCount += 1;
            var start = lands.stream().filter(x -> x.island == 0).findFirst().get();
            traverse(start, islandsCount);
            landsVisited = (int) lands.stream().filter(x -> x.island > 0).count();
        }

        System.out.println("Number of Islands is: " + islandsCount);
    }

    public static void traverse(Land l, int island) {
        l.island = island;
        if (l.north != null && l.north.island == 0)
            traverse(l.north, island);
        if (l.south != null && l.south.island == 0)
            traverse(l.south, island);
        if (l.east != null && l.east.island == 0)
            traverse(l.east, island);
        if (l.west != null && l.west.island == 0)
            traverse(l.west, island);
    }
}

class Land {
    public int x;
    public int y;
    public int island;
    public Land north;
    public Land south;
    public Land east;
    public Land west;

    public Land(int x, int y) {
        this.x = x;
        this.y = y;
        island = 0;
    }
}
