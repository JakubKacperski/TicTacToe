package com.jakub.games.tictactoe;

import com.jakub.games.tictactoe.impl.BoardImpl;
import com.jakub.games.tictactoe.impl.CheckerImpl;
import com.jakub.games.tictactoe.impl.ConsoleReadImpl;
import com.jakub.games.tictactoe.impl.Result;
import com.jakub.games.tictactoe.interfaces.Board;
import com.jakub.games.tictactoe.interfaces.Checker;
import com.jakub.games.tictactoe.interfaces.CheckerService;
import com.jakub.games.tictactoe.interfaces.ConsoleRead;
import com.jakub.games.tictactoe.services.CheckerServiceImpl;

class Main {
    public static void main(String[] args) {

        Board board = new BoardImpl();
        board.renderBoard();

        CheckerService checkerService = new CheckerServiceImpl();
        Result result = checkerService.checkGame(board);


        while (result.getWinner() == null) {
            ConsoleRead coordinates = new ConsoleReadImpl();
            System.out.println("Coordinate Y:");
            int y = coordinates.readNextInt();
            System.out.println("Coordinate X:");
            int x = coordinates.readNextInt();
            Checker checker = new CheckerImpl();
            checker.setCoordinates(y, x);
            board.putToBoard(checker);
            board.renderBoard();
            System.out.println(result);

        }

        if (result.getWinner().equals("X")) {
            System.out.println("Winner X");
        } else if (result.getWinner().equals("Y")) {
            System.out.println("Winner Y");
        } else if (result.getWinner().equals("XY")) {
            System.out.println("Draw");
        }
    }
}

