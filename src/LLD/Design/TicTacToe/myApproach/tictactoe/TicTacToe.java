package LLD.Design.TicTacToe.myApproach.tictactoe;

import LLD.Design.TicTacToe.myApproach.DiceType;
import LLD.Design.TicTacToe.myApproach.grid.Grid;
import LLD.Design.TicTacToe.myApproach.player.Player;

public interface TicTacToe {
    boolean isValid(int x, int y, Grid grid);
    boolean isWinning(Player player, DiceType diceType, int x, int y);
    String getWinner();

}
