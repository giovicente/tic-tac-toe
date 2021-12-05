package com.santander.tictactoe.utils;

import com.santander.tictactoe.service.Checker;

public class Printer {

    private final static String ENTER_PLACEMENT_MESSAGE = "Enter your placement (1-9): ";
    private final static String POSITION_TAKEN = "Position already taken! Enter a correct position!";

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char position : row) {
                System.out.print(position);
            }
            System.out.println();
        }
    }

    public static void printPlacementMessage() { System.out.println(ENTER_PLACEMENT_MESSAGE); }

    public static void printResult(String result) {
        result = Checker.checkWinner();
        System.out.println(result);
    }

    public static void printPositionTakenMessage() { System.out.println(POSITION_TAKEN); }

}
