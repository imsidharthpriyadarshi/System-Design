package LLD.Design.ChessGame.pieces;

import LLD.Design.ChessGame.move.MantriMove;
import LLD.Design.ChessGame.move.Move;

public class Mantri extends Pieces{
    public Mantri(boolean isWhite) {
        super(false, isWhite, "Mantri", new MantriMove());
    }
}
