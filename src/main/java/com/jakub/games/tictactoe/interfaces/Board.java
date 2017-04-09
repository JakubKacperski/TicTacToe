package com.jakub.games.tictactoe.interfaces;

public interface Board  {
    int DIMENSIONS = 3;
    void renderBoard();
    Checker getChecker(int i, int j);
    void putToBoard(Checker checker);
}
