package com.letscode.tictactoe.utils;

public class Board {

    public static char[][] getGameBoard() {

        char[][] gameBoard = {
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}
        };

        return gameBoard;
    }
}
