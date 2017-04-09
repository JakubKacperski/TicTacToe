package com.jakub.games.tictactoe.interfaces;
import com.jakub.games.tictactoe.enums.CheckerType;

public interface Checker {
    void setCoordinates(int i, int j);
    int[] getCoordinates();
    CheckerType getCheckerType();
}
