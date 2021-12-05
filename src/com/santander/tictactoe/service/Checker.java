package com.santander.tictactoe.service;

import com.santander.tictactoe.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Checker {

    public static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);

        List leftColumn = Arrays.asList(1, 4, 7);
        List middleColumn = Arrays.asList(2, 5, 8);
        List rightColumn = Arrays.asList(3, 6, 9);

        List firstCross = Arrays.asList(1, 5, 9);
        List secondCross = Arrays.asList(7, 5, 3);

        List<List> winningConditions = new ArrayList<List>();
        winningConditions.add(topRow);
        winningConditions.add(middleRow);
        winningConditions.add(bottomRow);
        winningConditions.add(leftColumn);
        winningConditions.add(middleColumn);
        winningConditions.add(rightColumn);
        winningConditions.add(firstCross);
        winningConditions.add(secondCross);

        for (List list : winningConditions) {
            if (Main.playerPositions.containsAll(list)) {
                return "Congratulations, you won!";
            } else if (Main.cpuPositions.containsAll(list)) {
                return "CPU wins! So sorry :(";
            } else if (Main.playerPositions.size() + Main.cpuPositions.size() == 9) {
                return "It's a tie!";
            }
        }

        return "";
    }

}
