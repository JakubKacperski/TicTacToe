package com.jakub.games.tictactoe.services;

import com.jakub.games.tictactoe.impl.Result;
import com.jakub.games.tictactoe.interfaces.Board;
import com.jakub.games.tictactoe.interfaces.CheckerService;

public class CheckerServiceImpl implements CheckerService {

    public Result checkGame(Board board) {
        Result resultRows = checkRows(board);
        Result resultColumns = checkColumns(board);
        if (resultRows.getWinner() == null || resultColumns.getWinner() == null) {
            return resultRows;
        } else if (resultRows.getWinner() != null) {
            return resultRows;
        } else if (resultColumns.getWinner() != null) {
            return resultColumns;
        }
        return null;
    }


    private Result checkRows(Board board) {
        int counterX;
        int counterO;
        Result result = new Result(null);
        for (int i = 0; i < Board.DIMENSIONS; i++) {

            counterX = 0;
            counterO = 0;

            for (int j = 0; j < Board.DIMENSIONS; j++) {

                if (board.getChecker(i, j).getCheckerType().getType().equals("X")) {
                    counterX += 1;
                } else if (board.getChecker(i, j).getCheckerType().getType().equals("O")) {
                    counterO += 1;
                }

            }
            if (counterX == Board.DIMENSIONS) {
                //System.out.println("Winner X");
                result = new Result("X");

            } else if (counterO == Board.DIMENSIONS) {
                //System.out.println("Winner O");
                result = new Result("O");
            }
        }
        return result;
    }

    private Result checkColumns(Board board) {
        int counterX;
        int counterO;
        Result result = new Result(null);


        for (int i = 0; i < Board.DIMENSIONS; i++) {

            counterX = 0;
            counterO = 0;

            for (int j = 0; j < Board.DIMENSIONS; j++) {

                if (board.getChecker(j, i).getCheckerType().getType().equals("X")) {
                    counterX += 1;
                } else if (board.getChecker(j, i).getCheckerType().getType().equals("O")) {
                    counterO += 1;
                }

            }
            if (counterX == Board.DIMENSIONS) {
                // System.out.println("Winner X");
                result = new Result("X");

            } else if (counterO == Board.DIMENSIONS) {
                //System.out.println("Winner O");
                result = new Result("O");
            }
        }
        return result;
    }
   /*Dopisać sprawdzanie zajętości pola*/
}
