package com.jakub.games.tictactoe.enums;

import com.jakub.games.tictactoe.interfaces.Board;

public class CheckerType {

    public String getType() {
        return type;
    }
    private String type = "";
    public CheckerType(int id){
        if(id< Board.DIMENSIONS*Board.DIMENSIONS){
            this.type = " ";
        }else if(id%2==0){
            this.type = "X";
        }else{
            this.type = "O";
        }
    }
    @Override
    public String toString() {
        return type;
    }
}
