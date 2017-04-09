package com.jakub.games.tictactoe.impl;
import com.jakub.games.tictactoe.enums.CheckerType;
import com.jakub.games.tictactoe.interfaces.Checker;
import java.util.Arrays;

public class CheckerImpl implements Checker {
    private static int id = 0;
    private final int[] coordinates = new int[2];
    public CheckerType getCheckerType() {
        return checkerType;
    }
    private final CheckerType checkerType = new CheckerType(id++);


    public void setCoordinates(int j, int i) {
        this.coordinates[0] = j;
        this.coordinates[1] = i;
    }
    public int[] getCoordinates() {
        //noinspection Since15
        return Arrays.copyOf(coordinates, 2);
    }
    @Override
    public String toString() {
        return checkerType.toString();
    }
}
