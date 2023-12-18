package org.example;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int num = 0;

        for(int x=0;x<grid.length;x++)
        {
            for(int y=0;y<grid[x].length;y++)
            {
                if(grid[x][y]=='1') {
                    num++;
                    searchLands(grid, x, y);
                }
            }
        }

        return num;
    }

    private void searchLands(char[][] grid, int x, int y){
        if(grid[x][y]=='0')
            return;

        grid[x][y]='0'; // visited

        if(x+1<grid.length)
            searchLands(grid,x+1,y);
        if(x-1>=0)
            searchLands(grid,x-1,y);
        if(y+1<grid[x].length)
            searchLands(grid,x,y+1);
        if(y-1>=0)
            searchLands(grid,x,y-1);
    }
}
