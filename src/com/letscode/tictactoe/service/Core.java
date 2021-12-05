package com.letscode.tictactoe.service;

import com.letscode.tictactoe.utils.Writer;
import com.letscode.tictactoe.utils.Printer;

import java.util.ArrayList;
import java.util.Random;

public class Core {

    public static void runGame(ArrayList<Integer> playerPositions, ArrayList<Integer> cpuPositions, char[][] gameBoard) {
        boolean isRunning = true;
        final String HUMAN = "human";
        final String CPU = "cpu";

        while (isRunning) {
            int playerPosition = Writer.scanPosition();

            while (playerPositions.contains(playerPosition) || cpuPositions.contains(playerPosition)) {
                Printer.printPositionTakenMessage();
                playerPosition = Writer.scanPosition();
            }

            Positioner.placePiece(gameBoard, playerPosition, HUMAN);

            String result = Checker.checkWinner();
            if (result.length() > 0) {
                Printer.printResult(result);
                break;
            }

            Printer.printGameBoard(gameBoard);
            System.out.println();

            Random randomPosition = new Random();
            int cpuPosition = randomPosition.nextInt(9) + 1;

            while (playerPositions.contains(cpuPosition) || cpuPositions.contains(cpuPosition)) {
                Printer.printPositionTakenMessage();
                cpuPosition = randomPosition.nextInt(9) + 1;
            }

            Positioner.placePiece(gameBoard, cpuPosition, CPU);

            Printer.printGameBoard(gameBoard);
            System.out.println();

            result = Checker.checkWinner();

            if (result.length() > 0) {
                Printer.printResult(result);
                break;
            }
        }
    }
}
