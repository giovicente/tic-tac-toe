package com.letscode.tictactoe.app;

import com.letscode.tictactoe.service.Core;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    public static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {
        Core.runGame(playerPositions, cpuPositions);
    }
}
