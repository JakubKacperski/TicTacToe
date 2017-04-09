package com.jakub.games.tictactoe.impl;
import com.jakub.games.tictactoe.interfaces.Board;
import com.jakub.games.tictactoe.interfaces.Checker;

public class BoardImpl implements Board {
    public BoardImpl() {
        this.board = new Checker[DIMENSIONS][DIMENSIONS];
        for (int i = 0; i < DIMENSIONS; i++) {
            for (int j = 0; j < DIMENSIONS; j++) {
                Checker checker = new CheckerImpl();
                checker.setCoordinates(i, j);
                this.putToBoard(checker);
            }
        }
    }
    private final Checker[][] board;
    public void renderBoard() {
        System.out.print("   ");
        for (int i = 0; i < DIMENSIONS; i++) {

            if (i < 10) {
                System.out.print(" " + i + "  ");
            } else {
                System.out.print(i + "  ");
            }
        }

        System.out.println("");

        for (int i = 0; i < DIMENSIONS; i++) {

            if (i < 10) {
                System.out.print(" " + i + " ");
            } else {
                System.out.print(i + " ");
            }

            for (int j = 0; j < DIMENSIONS; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("");
            System.out.print("   ");

            for (int k = 0; k < DIMENSIONS * 4; k++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }
    public Checker getChecker(int i, int j) {
        return board[i][j];
    }
    public void putToBoard(Checker checker){
        int coordinates[] = checker.getCoordinates();
        board[coordinates[0]][coordinates[1]] = checker;
    }
}
