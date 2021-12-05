package com.santander.tictactoe.service;

import com.santander.tictactoe.Main;

public class Placer {

    public static void placePiece(char[][] gameBoard, int position, String player) {

        char symbol = ' ';

        if (player.equals("human")) {
            symbol = 'O';
            Main.playerPositions.add(position);
        } else if (player.equals("cpu")) {
            symbol = 'X';
            Main.cpuPositions.add(position);
        }

        switch (position) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }
}
