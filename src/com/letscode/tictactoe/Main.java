package com.letscode.tictactoe;

import com.letscode.tictactoe.service.Core;
import com.letscode.tictactoe.utils.Printer;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    public static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {

        char[][] gameBoard = {
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}
        };

        Printer.printGameBoard(gameBoard);
        Core.runGame(playerPositions, cpuPositions, gameBoard);

    }
}
