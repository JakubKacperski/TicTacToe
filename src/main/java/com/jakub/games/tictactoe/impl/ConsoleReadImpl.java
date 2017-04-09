package com.jakub.games.tictactoe.impl;
import com.jakub.games.tictactoe.interfaces.ConsoleRead;
import java.util.Scanner;

public class ConsoleReadImpl implements ConsoleRead {
    public Integer readNextInt() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
