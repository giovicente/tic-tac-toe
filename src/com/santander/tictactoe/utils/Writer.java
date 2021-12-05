package com.santander.tictactoe.utils;

import java.util.Scanner;

public class Writer {

    private static Scanner gameScanner = new Scanner(System.in);

    public static int scanPosition() {
        Printer.printPlacementMessage();
        return gameScanner.nextInt();
    }

}
