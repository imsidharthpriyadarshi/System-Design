package LLD.Design.ChessGame.pieces;

import LLD.Design.ChessGame.move.BajirMove;
import LLD.Design.ChessGame.move.Move;

public class Bazir extends Pieces{
    public Bazir(boolean isWhite) {
        super(false, isWhite, "Bazir", new BajirMove());
    }
}
