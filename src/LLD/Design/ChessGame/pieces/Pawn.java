package LLD.Design.ChessGame.pieces;

import LLD.Design.ChessGame.move.PawnMove;

public class Pawn extends Pieces{
    public Pawn(boolean isWhite) {
        super(false, isWhite,"Pawn",new PawnMove());
    }
}
