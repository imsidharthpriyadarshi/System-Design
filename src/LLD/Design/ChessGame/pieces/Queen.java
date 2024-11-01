package LLD.Design.ChessGame.pieces;

import LLD.Design.ChessGame.move.Move;
import LLD.Design.ChessGame.move.QueenMove;

public class Queen extends Pieces{
    public Queen(boolean isWhite) {
        super(false, isWhite, "Queen", new QueenMove());
    }
}
