package LLD.Design.TicTacToe.myApproach.player;

import LLD.Design.TicTacToe.myApproach.DiceType;
import LLD.Design.TicTacToe.myApproach.grid.Grid;
import LLD.Design.TicTacToe.myApproach.grid.NormalGrid;
import LLD.Design.TicTacToe.myApproach.tictactoe.TicTacToe;

public class NormalPlayer implements Player{
    private final String name;
    private final DiceType diceType;
    private TicTacToe ticTacToe;

    public NormalPlayer(String name, DiceType diceType, TicTacToe ticTacToe){
        this.name=name;
        this.diceType=diceType;
        this.ticTacToe=ticTacToe;
    }
    @Override
    public void play(int x, int y) {
        Grid grid= new NormalGrid(this.diceType);
        if (!ticTacToe.isValid(x,y,grid)) {
            System.out.println("Your move is not valid either game ended");
            return;
        }
        if (ticTacToe.isWinning(this,this.diceType,x,y)) System.out.println("Game ended, Winner is" +ticTacToe.getWinner());

    }
    @Override
    public String getName(){
        return this.name;
    }
}
