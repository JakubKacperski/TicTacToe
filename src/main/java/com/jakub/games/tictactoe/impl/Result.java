package com.jakub.games.tictactoe.impl;

public class Result {
    public Result(String winner){
        this.winner = winner;
    }
    public String getWinner() {
        return winner;
    }

    /*null - nobody, O - O, X - X, XY - draw*/
    private String winner = null;

    @Override
    public String toString() {
        return "Result{" +
                "winner='" + winner + '\'' +
                '}';
    }
}
