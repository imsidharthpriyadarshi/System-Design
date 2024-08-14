package LLD.Design.TicTacToe.myApproach;

import LLD.Design.TicTacToe.myApproach.player.NormalPlayer;
import LLD.Design.TicTacToe.myApproach.player.Player;
import LLD.Design.TicTacToe.myApproach.tictactoe.NormalTicTacToe;
import LLD.Design.TicTacToe.myApproach.tictactoe.TicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new NormalTicTacToe(3);
        Player player1= new NormalPlayer("Siharth",DiceType.X, ticTacToe);
        Player player2= new NormalPlayer("Gaurav", DiceType.O, ticTacToe);
        player1.play(0,0);
        player2.play(2,2);
        player1.play(1,0);
        player2.play(0,2);
        player1.play(1,0);
        player1.play(2,0);
    }
}
