package org.example;

public class SurroundedRegions {
    public void solve(char[][] board) {
        for(int x=0;x<board.length;x++){
            for(int y=0;y<board[x].length;y++){
                if(board[x][y]=='O'){
                    boolean flip = findAdjacent(board,x,y);

                    if(flip)
                        flip(board,x,y);
                }
            }
        }

        for(int x=0;x<board.length;x++){
            for (int y=0;y<board[x].length;y++){
                if(board[x][y]=='o')
                    board[x][y]='O';
            }
        }
    }

    private boolean findAdjacent(char[][] board,int x,int y){
        if(x<0 || x>=board.length || y<0 || y>=board[x].length)
            return false;

        if(board[x][y]=='X'|| board[x][y]=='o')
            return true;

        board[x][y]='o';

        boolean result =findAdjacent(board,x+1,y);
        result&=findAdjacent(board,x-1,y);
        result&=findAdjacent(board,x,y+1);
        result&=findAdjacent(board,x,y-1);


        return result;
    }

    private void flip(char[][] board,int x,int y){
        if(x<0 || x>=board.length || y<0 || y>=board[x].length)
            return;

        if(board[x][y]=='X'|| board[x][y]=='O')
            return;

        board[x][y]='X';

        flip(board,x+1,y);
        flip(board,x-1,y);
        flip(board,x,y+1);
        flip(board,x,y-1);
    }
}
