package LLD.Design.TicTacToe.myApproach.tictactoe;

import LLD.Design.TicTacToe.myApproach.DiceType;
import LLD.Design.TicTacToe.myApproach.grid.Grid;
import LLD.Design.TicTacToe.myApproach.grid.NormalGrid;
import LLD.Design.TicTacToe.myApproach.player.Player;

import java.util.ArrayList;
import java.util.List;

public class NormalTicTacToe implements TicTacToe{

    private final List<List<Grid>> tictactoe;
    private boolean isEnd;
    private Player winner;
    private int size;

    public NormalTicTacToe(int size){
        this.tictactoe=new ArrayList<>(size);
        this.isEnd=false;
        this.size=size;
        init(size);
    }

    public void init(int size){
        for (int i=0;i<tictactoe.size();i++)
            this.tictactoe.add(new ArrayList<>(size));
    }
    @Override
    public boolean isValid(int x, int y, Grid grid) {
        if (x<size && y<size && !isEnd){

            if(tictactoe.get(x).get(y) == null){
                System.out.println("kdk");
                this.tictactoe.get(x).add(y,grid);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isWinning(Player player,DiceType diceType, int x, int y) {

         if (check( diceType, x, y)){
             this.isEnd=true;
             this.winner=player;
             return true;
         }
         return false;
    }

    @Override
    public String getWinner() {
        if (isEnd)return this.winner.getName();
        return null;
    }

    public boolean check(DiceType diceType, int x, int y){
        for (int i=0;i<tictactoe.size();i++){
            if (!tictactoe.get(i).get(y).getGridType().name().equals(diceType.name()))return false;
        }
        for (int i=0;i<tictactoe.size();i++){
            if (!tictactoe.get(x).get(i).getGridType().name().equals(diceType.name()))return false;
        }
        return true;
    }

}
