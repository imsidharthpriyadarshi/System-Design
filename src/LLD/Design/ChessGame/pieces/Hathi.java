package LLD.Design.ChessGame.pieces;

import LLD.Design.ChessGame.move.HathiMove;
import LLD.Design.ChessGame.move.Move;

public class Hathi extends Pieces{
    public Hathi(boolean is_white) {
        super(false, is_white, "Hathi", new HathiMove());
    }
}
