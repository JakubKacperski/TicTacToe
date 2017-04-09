package com.jakub.games.tictactoe.interfaces;

import com.jakub.games.tictactoe.impl.Result;

public interface CheckerService {
    Result checkGame(Board board);
}
