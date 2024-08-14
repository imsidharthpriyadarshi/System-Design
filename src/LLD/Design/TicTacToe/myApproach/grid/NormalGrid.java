package LLD.Design.TicTacToe.myApproach.grid;

import LLD.Design.TicTacToe.myApproach.DiceType;

public class NormalGrid implements Grid{
    private final DiceType diceType;

    public NormalGrid(DiceType diceType){
        this.diceType=diceType;
    }

    @Override
    public DiceType getGridType() {
        return this.diceType;
    }
}
